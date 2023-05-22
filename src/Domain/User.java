
package Domain;

import java.net.PasswordAuthentication;

public class User {
    
    private String[] thoughts; //circularDoublyLinkedList
    
    private String[] posts;//pila
    
    private String friends;//
    
    private String friendshipRequests;//cola
    
    
    private PasswordAuthentication passwordAuthentication;

    public User(String username, char[] password) {
        this.passwordAuthentication = new PasswordAuthentication(username, password);
    }
    
    
    
    
    
    
}//class
