
package Domain;

import GUI.JFWindow;
import java.io.IOException;

public class UserSesion {
    
    private User loggedUser;

    public UserSesion() throws IOException, CloneNotSupportedException {
//        this.loggedUser = null;

        loggedUser = new User();
        
        loggedUser.register("Alex", "12345678".toCharArray());
        loggedUser.createNewProfile("Alex");
        JFWindow.userBusiness.saveUser(loggedUser);
        
    }

    public User getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(User loggedUser) {
        this.loggedUser = loggedUser;
    }
    
}//class