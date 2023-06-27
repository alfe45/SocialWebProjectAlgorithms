package Domain;

import java.net.PasswordAuthentication;

public class User {

    private Profile profile;
    private PasswordAuthentication passwordAuthentication;

    public User() {
    }

    public Profile getProfile() {
        return profile;
    }
    
    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public PasswordAuthentication getPasswordAuthentication() {
        return passwordAuthentication;
    }

    public void setPasswordAuthentication(PasswordAuthentication passwordAuthentication) {
        this.passwordAuthentication = passwordAuthentication;
    }

    public void register(String username, char[] password){
        this.passwordAuthentication = new PasswordAuthentication(username, password);
    }//register

    @Override
    public String toString() {
        return "User{" + "profile=" + profile + ", passwordAuthentication=" + passwordAuthentication + '}';
    }

}//class
