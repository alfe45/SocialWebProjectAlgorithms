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
            this.graphData.saveGraph(this.usersGraph);
            this.usersGraph = this.graphData.loadGraph();
        } catch (IOException ex) {
            Logger.getLogger(SocialWebCore.class.getName()).log(Level.SEVERE, null, ex);
        }//try

        //aqui se refrescan los datos del core
        
        
        
    }//refresh

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
                                        (String)this.loggedUser.getFriends().getByPosition(k))) {
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
        
        ArrayList<String> auxName = new ArrayList<>();
        ArrayList<String> auxCommonFriends = new ArrayList<>();
        for (int i = 0; i < suggestions.size(); i++) {
            String[] nombres = suggestions.get(i).split("=");
            auxName.add(nombres[0]);
            auxCommonFriends.add(nombres[1]);
            System.out.println((i+1)+ "username: "+auxName.get(i) + "friends in common: "+auxCommonFriends.get(i));
        }//if

        return suggestions;
    }//suggestFriendsOfFriends

}//class
