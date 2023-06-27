
package Domain;

import Business.UserBusiness;
import DataStructures.MyLinkedStack;
import java.io.IOException;
import org.jdom.JDOMException;

public class SocialWebCore {
    
    public UserBusiness userBusiness;
    private User loggedUser;
    private MyLinkedStack friendsPosts;

    public SocialWebCore() throws JDOMException, IOException, CloneNotSupportedException {
        this.userBusiness = new UserBusiness();
        this.loggedUser = null;
        this.friendsPosts = new MyLinkedStack();
    }

    public  UserBusiness getUserBusiness() {
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

    public void refresh(){
        
        
        
    }//refresh
    
}//class
