
package Data;

import DataStructures.MyLinkedQueue;
import Domain.Profile;
import Domain.User;
import Utility.ElementsXML;
import Utility.FileRutes;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.PasswordAuthentication;
import java.util.Collection;
import org.jdom.Content;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

public class UserData {

    private Document jdomDocument;
    private Element root;
    private String rute;
    
    public UserData() throws JDOMException, IOException {
        this.rute = FileRutes.USERSPATH;
        File file = new File(this.rute);
        if (file.exists()) {
                SAXBuilder saxBuilder = new SAXBuilder();
                saxBuilder.setIgnoringElementContentWhitespace(true);
                this.jdomDocument = saxBuilder.build(file);
                this.root = this.jdomDocument.getRootElement();
        }else{
            this.root = new Element(ElementsXML.ROOT);
            this.jdomDocument = new Document(this.root);
            saveXML();
        }//if
    }

    public boolean login(PasswordAuthentication passwordAuthentication) {
        User user = loadUser(passwordAuthentication.getUserName());
        if (user == null)return false;
        String passwordFound = String.copyValueOf(user.getPasswordAuthentication().getPassword());
        String passwordIn = String.copyValueOf(passwordAuthentication.getPassword());
        
        System.out.println("UserFound: "
                +user.getPasswordAuthentication().getUserName()+" Pass: "+passwordFound);
        
        
        return passwordFound.equals(passwordIn);
    }//login

    public boolean saveUser(User user) throws IOException, CloneNotSupportedException {
        
        Element eUser = new Element(user.getProfile().getName());
        eUser.setAttribute(ElementsXML.USERNAME, user.getPasswordAuthentication().getUserName());
        eUser.setAttribute(ElementsXML.PASSWORD,String.copyValueOf(user.getPasswordAuthentication().getPassword()));
        
        Element eFriends = new Element(ElementsXML.FRIENDS);
        for (int i = 1; i < user.getProfile().getFriends().getSize(); i++) {
            User temp = (User)user.getProfile().getFriends().getByPosition(i);
            Element eCurrentFriend = new Element(ElementsXML.FRIEND);
            eCurrentFriend.setAttribute(ElementsXML.FRIEND_USERNAME, temp.getPasswordAuthentication().getUserName());
            eFriends.addContent(eCurrentFriend);
        }//for
        eUser.addContent(eFriends);
        
        Element eRequests = new Element(ElementsXML.REQUESTS);
        for (int i = 1; i < user.getProfile().getRequests().getSize(); i++) {
            MyLinkedQueue tempQueue = (MyLinkedQueue) user.getProfile().getRequests().clone();
            String temp = (String)tempQueue.delete();
            Element eCurrentRequest = new Element(ElementsXML.REQUEST);
            eCurrentRequest.setAttribute(ElementsXML.REQUESTF_FROM, temp);
            eRequests.addContent(eCurrentRequest);
        }//for
        eUser.addContent(eRequests);
        
        this.root.addContent(eUser);
        saveXML();
        return true;
    }//saveUser

    public User loadUser(String username) {
        Element rootChild = this.root.getChild(username);
        if (rootChild == null)return null;   
        
        User user = new User();
        String name = rootChild.getAttributeValue(ElementsXML.USERNAME);
        String pass = rootChild.getAttributeValue(ElementsXML.PASSWORD);
        
        Profile profile = new Profile(name);
//        profile.setName(username);
//        profile.setFriends(friends);
//        profile.setRequests(requests);
//        profile.setPosts(posts);
//        
//        
//        ArrayList<Estudiante> friends = new ArrayList<>();
//        List elementListEstudiantes = this.root.getChildren();
//        for (Object objectActual:elementListEstudiantes) {
//            Element eActual  = (Element) objectActual;
//            Estudiante e = new Estudiante(eActual.getAttributeValue("Carnet"),
//                    eActual.getChild("Nombre").getValue(),
//                    Integer.parseInt(eActual.getChild("Nota").getValue()));
//            estudiantes.add(e);
//        }//for
        
        user.setPasswordAuthentication(new PasswordAuthentication(name, pass.toCharArray()));
        user.setProfile(profile);
        
        
        
        
        
        
        
        
        
        
        return user;
    }//loadUser

    private void saveXML() throws FileNotFoundException, IOException {
        XMLOutputter xmlOutputter = new XMLOutputter();
        xmlOutputter.output(this.jdomDocument, new PrintWriter(this.rute));
    }//saveXML
    
    
    
}//class
