
package Domain;

import Business.UserBusiness;
import DataStructures.MyLinkedStack;
import java.io.IOException;
import org.jdom.JDOMException;

public class SocialWebCore {
    
    public UserBusiness userBusiness;
    private User loggedUser;
    private MyLinkedStack friendsPosts;
    private MyLinkedStack friendsPostsCopy;
    private Post currentPostInView;
    private Profile currentSelectedProfile;

    public SocialWebCore() throws JDOMException, IOException, CloneNotSupportedException {
        this.userBusiness = new UserBusiness();
        this.loggedUser = null;
        this.friendsPosts = new MyLinkedStack();
        this.friendsPostsCopy = (MyLinkedStack) this.friendsPosts.clone();
        this.currentPostInView = null;
        this.currentSelectedProfile = new Profile("NULL");
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

    public MyLinkedStack getFriendsPostsCopy() {
        return friendsPostsCopy;
    }

    public void setFriendsPostsCopy(MyLinkedStack friendsPostsCopy) {
        this.friendsPostsCopy = friendsPostsCopy;
    }

    public Post getCurrentPostInView() {
        return currentPostInView;
    }

    public void setCurrentPostInView(Post currentPostInView) {
        this.currentPostInView = currentPostInView;
    }

    public Profile getCurrentSelectedProfile() {
        return currentSelectedProfile;
    }

    public void setCurrentSelectedProfile(Profile currentSelectedProfile) {
        this.currentSelectedProfile = currentSelectedProfile;
    }

    public void refresh(){
        
        
        
    }//refresh
    
}//class
