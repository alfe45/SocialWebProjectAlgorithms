package Data;

import DataStructures.MyLinkedQueue;
import DataStructures.MyLinkedStack;
import Domain.Post;
import Domain.Request;
import Domain.Thought;

import Domain.User;
import GUI.JFWindow;
import Utility.ElementsXML;
import Utility.FileRutes;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
        this.rute = FileRutes.USERS_PATH;
        File file = new File(this.rute);
        if (file.exists()) {
            SAXBuilder saxBuilder = new SAXBuilder();
            saxBuilder.setIgnoringElementContentWhitespace(true);
            this.jdomDocument = saxBuilder.build(file);
            this.root = this.jdomDocument.getRootElement();
        } else {
            this.root = new Element(ElementsXML.ROOT_USERS);
            this.jdomDocument = new Document(this.root);
            saveXML();
        }//if
    }

    private void saveXML() throws FileNotFoundException, IOException {
        XMLOutputter xmlOutputter = new XMLOutputter();
        xmlOutputter.output(this.jdomDocument, new PrintWriter(this.rute));
    }//saveXML

    public boolean login(String username, String password) {
        Element eUser = this.root.getChild(username);
        if (eUser != null) {
            String passwordFound = eUser.getAttribute(ElementsXML.PASSWORD).getValue();
            return passwordFound.equals(password);
        } else {
            System.out.println("User does not exists! Login failed!");
            return false;
        }//if
    }//login

    public boolean saveNewUser(User user) throws IOException, CloneNotSupportedException {
        if (existsUser(user.getUsername())) {
            return false;
        } else {
            return saveUser(user);
        }//if
    }//saveNewUser

    public boolean saveUser(User user) throws IOException, CloneNotSupportedException {
        //deletes the user to override
        this.root.removeChild(user.getUsername());

        Element eUser = new Element(user.getUsername());
        eUser.setAttribute(ElementsXML.PASSWORD, user.getPassword());
        eUser.setAttribute(ElementsXML.NICKNAME, user.getNickname());

        Element eFriends = new Element(ElementsXML.FRIENDS);
        for (int i = 1; i <= user.getFriends().getSize(); i++) {
            String temp = (String) user.getFriends().getByPosition(i);
            Element eCurrentFriend = new Element(ElementsXML.FRIEND);
            eCurrentFriend.setAttribute(ElementsXML.USERNAME, temp);
            eFriends.addContent(eCurrentFriend);
        }//for
        eUser.addContent(eFriends);

        Element eRequests = new Element(ElementsXML.REQUESTS);
        MyLinkedQueue tempRequestsQueue = (MyLinkedQueue) user.getRequests().clone();
        while (!tempRequestsQueue.isEmpty()) {
            Request tempRequest = (Request) tempRequestsQueue.delete();
            Element eCurrentRequest = new Element(ElementsXML.REQUEST);
            eCurrentRequest.setAttribute(ElementsXML.DATE, tempRequest.getDate());
            eCurrentRequest.setAttribute(ElementsXML.REQUEST_FROM, tempRequest.getSentBy());
            eCurrentRequest.setAttribute(ElementsXML.STATE, tempRequest.getState() + "");
            eRequests.addContent(eCurrentRequest);
        }//while
        eUser.addContent(eRequests);
        Element ePosts = new Element(ElementsXML.POSTS);
        MyLinkedStack tempPostsStack = (MyLinkedStack) user.getPosts().clone();
        while (!tempPostsStack.isEmpty()) {
            Post tempPost = (Post) tempPostsStack.pop();
            Element eCurrentPost = new Element(ElementsXML.POST);
            eCurrentPost.setAttribute(ElementsXML.TITLE, tempPost.getTitle());
            eCurrentPost.setAttribute(ElementsXML.DATE, tempPost.getDate());
            for (int i = 1; i <= tempPost.getThoughts().getSize(); i++) {
                String tempThought = tempPost.getThought(i);
                Element eCurrentThought = new Element(ElementsXML.THOUGHT);
                eCurrentThought.setAttribute(ElementsXML.TEXT, tempThought);
                eCurrentPost.addContent(eCurrentThought);
            }//for
            ePosts.addContent(eCurrentPost);
        }//while
        eUser.addContent(ePosts);
        this.root.addContent(eUser);
        saveXML();
        return true;
    }//saveUser

    public User loadUser(String username) {
        Element eUser = this.root.getChild(username);
        if (eUser == null) {
            return null;
        }//if

        String password = eUser.getAttributeValue(ElementsXML.PASSWORD);
        String nickname = eUser.getAttributeValue(ElementsXML.NICKNAME);
        User user = new User(username, password);
        user.setNickname(nickname);

        //loads friends
        Element eFriends = eUser.getChild(ElementsXML.FRIENDS);
        if (eFriends != null) {
            List<Element> friendsList = eFriends.getChildren();
            for (int i = 0; i < friendsList.size(); i++) {
                user.getFriends().addEnd(
                        friendsList.get(i).getAttribute(ElementsXML.USERNAME).getValue());
            }//for
        }//if

        //loads requests
        Element eRequests = eUser.getChild(ElementsXML.REQUESTS);
        if (eRequests != null) {
            List<Element> requestsList = eRequests.getChildren();
            for (int i = 0; i < requestsList.size(); i++) {
                Element eCurrent = requestsList.get(i);
                Request tempRequest = new Request(eCurrent.getAttributeValue(ElementsXML.DATE), eCurrent.getAttribute(ElementsXML.REQUEST_FROM).getValue(),
                        user.getUsername());
                tempRequest.setSentTo(eCurrent.getAttributeValue(ElementsXML.STATE));
                user.getRequests().insert(tempRequest);
            }//for
        }//if

        //loads posts
        Element ePosts = eUser.getChild(ElementsXML.POSTS);
        if (ePosts != null) {
            List<Element> postsList = ePosts.getChildren();
            for (int i = 0; i < postsList.size(); i++) {
                Element eCurrentPost = postsList.get(i);
                Post tempPost = new Post();
                tempPost.setTitle(eCurrentPost.getAttributeValue(ElementsXML.TITLE));
                tempPost.setDate(eCurrentPost.getAttributeValue(ElementsXML.DATE));
                List<Element> thoughtsList = eCurrentPost.getChildren();
                for (int j = 0; j < thoughtsList.size(); j++) {
                    Element eCurrentThought = thoughtsList.get(j);
                    tempPost.getThoughts().addEnd(new Thought(eCurrentThought.getAttributeValue(ElementsXML.TEXT)));
                }//for j
                user.getPosts().push(tempPost);
            }//for
        }//if

        return user;
    }//loadProfile

    public boolean existsUser(String username) {
        return root.getChild(username) != null;
    }//existsUser

    public boolean requestAlreadySent(String sentTo, String sentBy) {
        Element user1 = this.root.getChild(sentTo);
        Element user2 = this.root.getChild(sentBy);

        if (user1 == null || user2 == null) {
            System.out.println("requestAlreadySent(): One of the users does not exists on XML!");
            return false;
        }//if
        List<Element> requestsListUser1 = user1.getChild(ElementsXML.REQUESTS).getContent();
        List<Element> requestsListUser2 = user2.getChild(ElementsXML.REQUESTS).getContent();
        
        if (requestsListUser1 == null || requestsListUser2 == null) {
            System.out.println("requestAlreadySent(): One of the has not requests on XML!");
            return false;
        }//if
        
        for (Element eCurrentRequest : requestsListUser1) {
            if (eCurrentRequest.getAttributeValue(ElementsXML.REQUEST_FROM).equals(sentBy)) {
                return true;
            }//if
        }//for
        
        for (Element eCurrentRequest : requestsListUser2) {
            if (eCurrentRequest.getAttributeValue(ElementsXML.REQUEST_FROM).equals(sentTo)) {
                return true;
            }//if
        }//for
 
        return false;

    }//existsUser

    public boolean areFriends(String sentTo, String sentBy) {
        //otra opcion
//        return JFWindow.socialWebCore.getUsersGraph().existEdge(sentTo, sentBy);
        User user1 = loadUser(sentTo);
        User user2 = loadUser(sentBy);

        if (user1 == null || user2 == null) {
            System.out.println("areFriends(): One of the users does not exists on XML!");
            return false;
        }//if

        for (int i = 1; i <= user1.getFriends().getSize(); i++) {
            if (user1.getFriends().getByPosition(i).equals(sentBy)) {
                return true;
            }//if
        }//for

        for (int i = 1; i <= user2.getFriends().getSize(); i++) {
            if (user2.getFriends().getByPosition(i).equals(sentTo)) {
                return true;
            }//if
        }//for
        return false;
    }//existsUser

    public MyLinkedStack loadAllPost() {
        MyLinkedStack allPosts = new MyLinkedStack();

        //aqui se cargarán todos los posts de todos los usuarios desde el .xml
        //posts for testing
        Post post1 = new Post();
        post1.addThought("Post 1 Thought 01");
        post1.addThought("Post 1 Thought 02");
        post1.addThought("Post 1 Thought 03");
        post1.addThought("Post 1 Thought 04");
        post1.addThought("Post 1 Thought 05");
        post1.addThought("Post 1 Thought 06");
        post1.addThought("Post 1 Thought 07");
        post1.addThought("Post 1 Thought 08");
        post1.addThought("Post 1 Thought 09");
        post1.addThought("Post 1 Thought 10");

        Post post2 = new Post();
        post2.addThought("Post 2 Thought 01");
        post2.addThought("Post 2 Thought 02");
        post2.addThought("Post 2 Thought 03");
        post2.addThought("Post 2 Thought 04");
        post2.addThought("Post 2 Thought 05");
        post2.addThought("Post 2 Thought 06");
        post2.addThought("Post 2 Thought 07");
        post2.addThought("Post 2 Thought 08");
        post2.addThought("Post 2 Thought 09");
        post2.addThought("Post 2 Thought 10");

        Post post3 = new Post();
        post3.addThought("Post 3 Thought 01");
        post3.addThought("Post 3 Thought 02");
        post3.addThought("Post 3 Thought 03");
        post3.addThought("Post 3 Thought 04");
        post3.addThought("Post 3 Thought 05");
        post3.addThought("Post 3 Thought 06");
        post3.addThought("Post 3 Thought 07");
        post3.addThought("Post 3 Thought 08");
        post3.addThought("Post 3 Thought 09");
        post3.addThought("Post 3 Thought 10");

        allPosts.push(post3);
        allPosts.push(post2);
        allPosts.push(post1);

        return allPosts;

//                System.out.println("Name loadAllPosts: " + JFWindow.userSesion.getLoggedUser().getProfile().getName());
//        JFWindow.userSesion.getLoggedUser().getProfile().setPosts(allposts);
//        int userPostsCounter = JFWindow.userSesion.getLoggedUser().getProfile().getPosts().getSize();
//
//        System.out.println("User post counter: " + userPostsCounter);
//        MyLinkedStack userPostsCopy = (MyLinkedStack) JFWindow.userSesion.getLoggedUser().getProfile().getPosts().clone();
//
//        for (int i = 1; i <= userPostsCounter; i++) {
//            this.allposts.push(userPostsCopy.top);
//        }//for
//        
    }//loadAllPost
//

//    public ArrayList<User> loadAllUser() {
//        List elementListUsers = this.root.getChildren();
//
//        if (elementListUsers == null) {
//            return null;
//        }//if
//
//        for (Object objetoActual : elementListUsers) {
//            Element eActualObject = (Element) objetoActual;  
//            String password = elementListUsers.getAttributeValue(ElementsXML.PASSWORD);
//            
//            User user = new User(
//                    eActualObject.getAttributeValue("name"), 
//                    password);
//
//            //loads friends
//            Element eFriends = elementListUsers.getChild(ElementsXML.FRIENDS);
//            List<Element> friendsList = eFriends.getChildren();
//
//            for (int i = 0; i < friendsList.size(); i++) {
//                user.getFriends().addEnd(
//                        friendsList.get(i).getAttribute(ElementsXML.USERNAME).getValue());
//            }//for
//
//            //loads requests
//            Element eRequests = elementListUsers.getChild(ElementsXML.REQUESTS);
//            List<Element> requestsList = eRequests.getChildren();
//            for (int i = 0; i < requestsList.size(); i++) {
//                Element eCurrent = requestsList.get(i);
//                user.getRequests().insert(new Request("DATE", eCurrent.getAttribute(ElementsXML.REQUEST_FROM).getValue(),
//                        user.getUsername()));
//            }//for
//
//            //loads posts
//            Element ePosts = elementListUsers.getChild(ElementsXML.REQUESTS);
//            List<Element> postsList = ePosts.getChildren();
//            for (int i = 0; i < postsList.size(); i++) {
//                Element eCurrentPost = postsList.get(i);
//                Post temp = new Post();
//                List<Element> thoughtsList = eCurrentPost.getChildren();
//                for (int j = 0; j < thoughtsList.size(); j++) {
//                    Element eCurrentThought = thoughtsList.get(j);
//                    temp.getThoughts().addEnd(new Thought(eCurrentThought.getAttributeValue(ElementsXML.THOUGHT)));
//                }//for j
//                user.getPosts().push(temp);
//            }//for
//
//        }// for        
//
//        return user;
//
//    }//loadProfile
    
    public ArrayList<User> getFriendsRequestXML(String username) {
        ArrayList<User> userFriendsRequest = new ArrayList<>();
        Element eUser = this.root.getChild(username);
        if (eUser == null) {
            return null;
        }//if

        String password = eUser.getAttributeValue(ElementsXML.PASSWORD);
        User user = new User(username, password);

        //loads requests
        Element eRequests = eUser.getChild(ElementsXML.REQUESTS);
        List<Element> requestsList = eRequests.getChildren();
        for (int i = 0; i < requestsList.size(); i++) {
            Element eCurrent = requestsList.get(i);
            user.getRequests().insert(new Request("DATE", eCurrent.getAttribute(ElementsXML.REQUEST_FROM).getValue(),
                    user.getUsername()));
            userFriendsRequest.add(user);
        }//for
        return userFriendsRequest;
    }//loadProfile

}//class
