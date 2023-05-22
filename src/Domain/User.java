
package Domain;

import java.net.PasswordAuthentication;

public class User {
    
    private String[] thoughts; //circularDoublyLinkedList
    
    private String[] posts;
    
    private PasswordAuthentication pa;

    public User(String username, char[] password) {
        this.pa = new PasswordAuthentication(username, password);
    }
    
    
    
    
    
    
}//class
