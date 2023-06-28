package Domain;

import Business.UserBusiness;
import DataStructures.MyLinkedStack;
import DataStructures.MyListGraph;
import GUI.JFWindow;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.jdom.JDOMException;

public class SocialWebCore {

    private UserBusiness userBusiness;
    private User loggedUser;
    private MyLinkedStack friendsPosts;
    private MyListGraph usersGraph;
//    private GraphData grahpData;

    public SocialWebCore() throws JDOMException, IOException, CloneNotSupportedException {
        this.userBusiness = new UserBusiness();
        this.loggedUser = null;
        this.friendsPosts = new MyLinkedStack();
//        this.usersGraph = this.graphData.loadGraph();
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

    public void refresh() {

    }//refresh

    public ArrayList<User> suggestFriendsOfFriends() {
        ArrayList<User> friendsOfFriends = new ArrayList<>();
        int control = 0;
        
        for (int i = 0; i < this.loggedUser.getFriends().getSize(); i++) {//recorro amigos de usuario loggeado
            User friendAux = JFWindow.socialWebCore.getUserBusiness().loadUser(this.loggedUser.getFriends().getByPosition(i)+"");
//                    (User) this.loggedUser.getFriends().getByPosition(i);
            
            if (this.usersGraph.existEdge(this.loggedUser, friendAux)) { //si es amigo entra

                for (int j = 0; j < friendAux.getFriends().getSize(); j++) { //recorro amigos de amigo de usuario loggeado
                    User friendOfFriendAux =  JFWindow.socialWebCore.getUserBusiness().loadUser(friendAux.getFriends().getByPosition(i)+"");

                    if (!this.usersGraph.existEdge(this.loggedUser, friendOfFriendAux)) { //si ese amigo no es amigo del usuario loggeado

                        for (int k = 0; k < friendsOfFriends.size(); k++) { //recorro el araylist
                            if (friendsOfFriends.get(i).equals(friendOfFriendAux)) { //si no esta guardado, lo guarda, sino lo ignora
                                control++;
                                friendsOfFriends.get(i).setPriority(friendOfFriendAux.getPriority() + 1);
                            }
                        }
                        if (control == 0) {
                            friendsOfFriends.add(friendOfFriendAux);
                        } else {
                            control = 0;
                        }
                    }

                }
            }
        }
        
        //ordeno el arraylist
        Collections.sort(friendsOfFriends, new Comparator<User>() {
            @Override
            public int compare(User p1, User p2) {
                return new Integer(p1.getPriority()).compareTo(new Integer(p2.getPriority()));
            }
        });

        return friendsOfFriends;
    }
    
    public void acceptFriendRequest(User finalUser){
        if (!this.usersGraph.existEdge(this.loggedUser, finalUser)) {
            this.usersGraph.addEdge(this.loggedUser, finalUser);
        }//if
        
    }//acceptFriendRequest

}//class
