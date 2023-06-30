package Domain;

import Business.UserBusiness;
import Data.GraphData;
import DataStructures.MyLinkedStack;
import DataStructures.MyListGraph;
import GUI.JFWindow;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom.JDOMException;

public class SocialWebCore {

    private UserBusiness userBusiness;
    private User loggedUser;
    private MyLinkedStack friendsPosts;
    private MyListGraph usersGraph;
    private GraphData graphData;

    public SocialWebCore() throws JDOMException, IOException, CloneNotSupportedException {
        this.userBusiness = new UserBusiness();
        this.loggedUser = null;
        this.friendsPosts = new MyLinkedStack();
        this.graphData = new GraphData();
        this.usersGraph = this.graphData.loadGraph();
    }

    public UserBusiness getUserBusiness() {
        return userBusiness;
    }

    public void setUserBusiness(UserBusiness userBusiness) {
        this.userBusiness = userBusiness;
    }

    public User getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(User loggedUser) {
        this.loggedUser = loggedUser;
    }

    public MyLinkedStack getFriendsPosts() {
        return friendsPosts;
    }

    public void setFriendsPosts(MyLinkedStack friendsPosts) {
        this.friendsPosts = friendsPosts;
    }

    public GraphData getGraphData() {
        return graphData;
    }

    public void setGraphData(GraphData graphData) {
        this.graphData = graphData;
    }

    public MyListGraph getUsersGraph() {
        return usersGraph;
    }

    public void setUsersGraph(MyListGraph usersGraph) {
        this.usersGraph = usersGraph;
    }

    public void refresh() {
        try {
            this.usersGraph = this.graphData.loadGraph();
            this.graphData.saveGraph(this.usersGraph);
        } catch (IOException ex) {
            Logger.getLogger(SocialWebCore.class.getName()).log(Level.SEVERE, null, ex);
        }//try
        //aqui se refrescan los datos del core
    }//refresh

    public void sendFriendshipRequest(String sentTo, String sentBy) {
        if (userBusiness.existsUser(sentTo)) {
            try {
                if (!userBusiness.requestAlreadySent(sentTo, sentBy) && !userBusiness.areFriends(sentTo, sentBy)) {
                    User targetUser = userBusiness.loadUser(sentTo);
                    targetUser.getRequests().insert(new Request("DEFAULTDATE", sentBy, sentTo));
                    userBusiness.saveUser(targetUser);
                    System.out.println("Request sent and saved on XML!");
                } else {
                    System.out.println("Request already sent or are friends!");
                }//if
            } catch (IOException | CloneNotSupportedException ex) {
                Logger.getLogger(SocialWebCore.class.getName()).log(Level.SEVERE, null, ex);
            }//try
        }//if
    }//sendFriendshipRequest

    public boolean acceptFriendshipRequest(String sentBy) throws IOException {
        User userSentBy = this.userBusiness.loadUser(sentBy);
        int areFriends = 0;
        boolean iHaveYourRequest = false;

        for (int i = 0; i < userSentBy.getRequests().getSize(); i++) { //recorro las request
            if (userSentBy.getRequests().firstElement().equals(sentBy)) { //dentro de las request tengo al que me la envió?
                for (int p = 0; p < this.loggedUser.getFriends().getSize(); p++) {  //recorro los amigos del sentTo
                    if (this.loggedUser.getFriends().getByPosition(p).equals(sentBy)) { //veo si lo tengo dentro de mi lista de amigos
                        areFriends = 1;
                    }
                }
                if (!this.userBusiness.areFriends(this.loggedUser.getUsername(), sentBy) && areFriends == 0) {
                    try {
                        //verifica que no son amigos en el xml y en el grafo
                        this.usersGraph.addEdge(this.loggedUser.getUsername(), userSentBy.getUsername()); //agrego amigo al grafo
                        this.loggedUser.getFriends().addEnd(userSentBy); //agrego amigo a la lista de amigos
                        this.userBusiness.saveUser(loggedUser);//se guarda el usuario, sin embargo no se sobre escribe, haga el metodo weonn

                        userSentBy.getFriends().addEnd(this.loggedUser.getUsername()); //el amigo que me envió la solicitud voy a aparecer en su lista de amigos
                        this.userBusiness.saveUser(userSentBy); //sobreescribo al mismo usuario pero ahora con mi amistad en su lista de amigos

                        return true;
                    } catch (CloneNotSupportedException ex) {
                        Logger.getLogger(SocialWebCore.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            //delete
        }
        return false;
    }//acceptFriendshipRequest

    public ArrayList<String> showFriendsRequest() {
        ArrayList<User> friendsRequest = new ArrayList<>();
        ArrayList<String> friendsRequestString = new ArrayList<>();

       
            friendsRequest = this.userBusiness.getFriendsRequestXML(this.loggedUser.getUsername());
            for (int i = 0; i < friendsRequest.size(); i++) {
                friendsRequestString.add(friendsRequest.get(i).getUsername());
            }
       
            friendsRequest = null;
        

        return friendsRequestString;
    }

    public ArrayList<String> suggestFriendsOfFriends() {
        ArrayList<String> suggestions = new ArrayList<>();
        for (int i = 1; i <= this.loggedUser.getFriends().getSize(); i++) {//recorro amigos de usuario loggeado
            User friendAux = JFWindow.socialWebCore.getUserBusiness().loadUser(this.loggedUser.getFriends().getByPosition(i) + "");
            if (this.usersGraph.existEdge(this.loggedUser.getUsername(), friendAux.getUsername())) { //si es amigo entra
                for (int j = 1; j <= friendAux.getFriends().getSize(); j++) { //recorro amigos de amigo de usuario loggeado
                    User friendOfFriendAux = JFWindow.socialWebCore.getUserBusiness().loadUser(friendAux.getFriends().getByPosition(i) + "");
                    if (!this.usersGraph.existEdge(this.loggedUser.getUsername(), friendOfFriendAux.getUsername())) { //si ese amigo no es amigo del usuario loggeado
                        if (!suggestions.contains(friendOfFriendAux.getUsername())) {
                            int amigosEnComun = 1;
                            for (int k = 1; k <= this.loggedUser.getFriends().getSize(); k++) {
                                if (this.usersGraph.existEdge(friendOfFriendAux.getUsername(),
                                        (String) this.loggedUser.getFriends().getByPosition(k))) {
                                    amigosEnComun++;
                                }//if
                            }//for
                            suggestions.add(friendOfFriendAux.getUsername() + "=" + amigosEnComun);
                        }//if
                    }//if
                }//for j
            } else {
                System.out.println("Error, dicen que son amigos, pero no lo son. conexion no existente en el grafo");
            }//if
        }//for i

        //ordeno el arraylist
        Collections.sort(suggestions, new Comparator<String>() {
            @Override
            public int compare(String p1, String p2) {
                return new Integer(p1.split("=")[1]).compareTo(new Integer(p2.split("=")[1]));
            }//compare
        });
        return suggestions;
    }//suggestFriendsOfFriends

}//class
