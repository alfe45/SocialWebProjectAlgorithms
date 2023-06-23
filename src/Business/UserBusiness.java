
package Business;

import Data.UserData;
import DataStructures.MyLinkedStack;
import Domain.Profile;
import Domain.User;
import java.io.IOException;
import java.net.PasswordAuthentication;
import org.jdom.JDOMException;

public class UserBusiness {
    
    private UserData userData;
    
    public UserBusiness() throws JDOMException, IOException {
        this.userData = new UserData();
    }
    
    public boolean login(PasswordAuthentication passwordAuthentication){
        if ((passwordAuthentication.getUserName().equals("")
                ||passwordAuthentication.getPassword().length==0))return false;
        return this.userData.login(passwordAuthentication);
    }//login
    
    public boolean saveUser(User user) throws IOException, CloneNotSupportedException{
        return this.userData.saveUser(user);
    }//saveUser
    
    public boolean saveNewUser(User user) throws IOException, CloneNotSupportedException{
        return this.userData.saveNewUser(user);
    }//saveNewUser
    
    public Profile loadProfile(String username){
        return this.userData.loadProfile(username);
    }//loadProfile
    
    public MyLinkedStack loadAllPost(){
        return this.userData.loadAllPost();
    }//loadAllPost
    
//    public MyLinkedStack loadUserPosts(String username){
//        return this.userData.loadUserPosts();
//    }//loadUserPosts

    public boolean searchProfile(String username) {
        return this.userData.searchProfile(username);
    }//searchProfile
    
}//class
