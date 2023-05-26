
package Business;

import Data.UserData;
import DataStructures.MyLinkedStack;
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
        if ((passwordAuthentication.getUserName().equals("")||passwordAuthentication.getPassword().length==0))return false;
        return this.userData.login(passwordAuthentication);
    }//login
    
    public boolean saveUser(User user) throws IOException, CloneNotSupportedException{
        if (user.getProfile() == null)return false;
        return this.userData.saveUser(user);
    }//saveUser
    
    public User loadUser(String username){
        return this.userData.loadUser(username);
    }//loadUser
    
    public MyLinkedStack loadAllPost(){
        return this.userData.loadAllPost();
    }//loadAllPost
    
}//class
