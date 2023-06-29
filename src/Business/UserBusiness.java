package Business;

import Data.UserData;
import DataStructures.MyLinkedStack;
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
    
    public boolean areFriends(String sentTo, String sentBy) {
        return this.userData.areFriends(sentTo, sentBy);
    }//existsUser

    public ArrayList<User> getFriendsRequestXML(String username) {
        return this.userData.getFriendsRequestXML(username);
    }
}//class
