package Domain;

import java.net.PasswordAuthentication;

public class User {

    private String[] thoughts; //circularDoublyLinkedList

    private String[] posts;//pila

    private String friends;//

    private String friendshipRequests;//cola

    private String username;

    private PasswordAuthentication passwordAuthentication;

    public User(String username, char[] password) {
        this.passwordAuthentication = new PasswordAuthentication(username, password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public PasswordAuthentication getPasswordAuthentication() {
        return passwordAuthentication;
    }

    public void setPasswordAuthentication(PasswordAuthentication passwordAuthentication) {
        this.passwordAuthentication = passwordAuthentication;
    }

}//class
