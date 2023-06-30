package Business;

import Data.UserData;
import DataStructures.MyLinkedStack;
import DataStructures.MyListGraph;
import Domain.User;
import java.io.IOException;
import java.util.ArrayList;
import org.jdom.JDOMException;

public class UserBusiness {

    private UserData userData;

    public UserBusiness() throws JDOMException, IOException {
        this.userData = new UserData();
    }

    public boolean login(String username, String password) {
        if (username.equals("") || password.equals("")) {
            return false;
        }//if
        return this.userData.login(username.toLowerCase(), password);
    }//login

    public boolean saveUser(User user) throws IOException, CloneNotSupportedException {
        return this.userData.saveUser(user);
    }//saveUser

    public boolean saveNewUser(User user) throws IOException, CloneNotSupportedException {
        return this.userData.saveNewUser(user);
    }//saveNewUser

    public User loadUser(String username) {
        return this.userData.loadUser(username);
    }//loadProfile

    public MyLinkedStack loadAllPost() {
        return this.userData.loadAllPost();
    }//loadAllPost

    public boolean existsUser(String username) {
        return this.userData.existsUser(username);
    }//existsUser

    public boolean requestAlreadySent(String sentTo, String sentBy) {
        return this.userData.requestAlreadySent(sentTo, sentBy);
    }//existsUser
    
    public boolean areFriends(String user1, String user2) {
        return this.userData.areFriends(user1, user2);
    }//existsUser

    public ArrayList<User> getFriendsRequestXML(String username) {
        return this.userData.getFriendsRequestXML(username);
    }
    
    public boolean acceptFriendshipRequest(String sentTo, String sentBy) throws IOException, CloneNotSupportedException {
        return this.userData.acceptFriendshipRequest(sentTo, sentBy);
    }//acceptFriendshipRequest
    
    public boolean deleteFriendshipRequest(String sentTo, String sentBy) throws IOException, CloneNotSupportedException {
        return this.userData.deleteFriendshipRequest(sentTo, sentBy);
    }//deleteFriendshipRequest
  
    public MyListGraph loadGraph() {
        return this.userData.loadGraph();
    }//loadGraph
    
}//class
