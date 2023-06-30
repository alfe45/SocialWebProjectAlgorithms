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
import javax.swing.JOptionPane;
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
        this.usersGraph = userBusiness.loadGraph();
        this.graphData.saveGraph(usersGraph);
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

        this.usersGraph = this.graphData.loadGraph();

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

    public boolean acceptFriendshipRequest(String sentBy) throws IOException, CloneNotSupportedException {
        if (userBusiness.requestAlreadySent(this.loggedUser.getUsername(), sentBy)) {
            if (userBusiness.acceptFriendshipRequest(this.loggedUser.getUsername(), sentBy)) {
                JOptionPane.showMessageDialog(null, "You and " + sentBy + " are now friends!");
                return true;
            } else {
                System.out.println("Error>acceptFriendshipRequest()");
            }//else
        }//if
        return false;
    }//acceptFriendshipRequest

    public boolean deleteFriendshipRequest(String sentBy) throws IOException, CloneNotSupportedException {
        if (userBusiness.requestAlreadySent(this.loggedUser.getUsername(), sentBy)) {
            if (userBusiness.deleteFriendshipRequest(this.loggedUser.getUsername(), sentBy)) {
                JOptionPane.showMessageDialog(null, "Request deleted");
            } else {
                System.out.println("Error>deleteFriendshipRequest()");
            }//else
            return true;
        }//if
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

    public ArrayList<String> suggestFriendsOfFriends() throws IOException, CloneNotSupportedException {
        ArrayList<String> suggestions = new ArrayList<>();

        for (int i = 1; i <= this.loggedUser.getFriends().getSize(); i++) {//recorro amigos de usuario loggeado

            User friendAux = JFWindow.socialWebCore.getUserBusiness().loadUser(this.loggedUser.getFriends().getByPosition(i) + "");

            if (this.usersGraph.existEdge(this.loggedUser.getUsername(), friendAux.getUsername())) { //si es amigo entra

                for (int j = 1; j <= friendAux.getFriends().getSize(); j++) { //recorro amigos de amigo de usuario loggeado
                    User friendOfFriendAux = JFWindow.socialWebCore.getUserBusiness().loadUser(friendAux.getFriends().getByPosition(i) + "");
                    if (friendOfFriendAux != null) {
                        if (this.userBusiness.areFriends(this.loggedUser.getUsername(), friendOfFriendAux.getUsername())) {
                            if (!this.usersGraph.existEdge(this.loggedUser.getUsername(), friendOfFriendAux.getUsername())) { //si ese amigo no es amigo del usuario loggeado
                                int amigosEnComun = 1;
                                if (suggestions.contains(friendOfFriendAux.getUsername())) {
                                    amigosEnComun++;
                                }//if
                                suggestions.add(friendOfFriendAux.getUsername() + "=" + amigosEnComun);
                            }//if
                        }
                    }
                }//for jn
            } else {
                System.out.println("Error, dicen que son amigos, pero no lo son. conexion no existente en el grafo");
            }//if
        }//for i

        //ordeno el arraylist
        Collections.sort(suggestions, new Comparator<String>() {
            public int compare(String p1, String p2) {
                return new Integer(p1.split("=")[1]).compareTo(new Integer(p2.split("=")[1]));
            }//compare
        });
//        System.out.println(suggestions);
        return suggestions;
    }//suggestFriendsOfFriends

}//class
