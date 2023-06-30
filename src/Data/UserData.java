package Data;

import DataStructures.MyDoubleLinkedList;
import DataStructures.MyLinkedQueue;
import DataStructures.MyLinkedStack;
import DataStructures.MyListGraph;
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

    public User loadUser(String username) throws IOException, CloneNotSupportedException {
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
                tempRequest.setState(Integer.parseInt(eCurrent.getAttributeValue(ElementsXML.STATE)));
                if (tempRequest.getState() == 0) {
                    user.getRequests().insert(tempRequest);
                }//if
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
        saveUser(user);
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

    public boolean areFriends(String user1, String user2) throws IOException, CloneNotSupportedException {

        User userI1 = loadUser(user1);
        User userI2 = loadUser(user2);

        if (userI1 == null || userI2 == null) {
            System.out.println("areFriends(): One of the users does not exists on XML!");
            return false;
        }//if

        for (int i = 1; i <= userI1.getFriends().getSize(); i++) {
            if (userI1.getFriends().getByPosition(i).equals(user2)) {
                return true;
            }//if
        }//for

        for (int i = 1; i <= userI2.getFriends().getSize(); i++) {
            if (userI2.getFriends().getByPosition(i).equals(user1)) {
                return true;
            }//if
        }//for
        return false;
    }//existsUser

    public boolean acceptFriendshipRequest(String sentTo, String sentBy) throws IOException, CloneNotSupportedException {

        User userSentTo = loadUser(sentTo);
        User userSentBy = loadUser(sentBy);

        if (userSentTo == null || userSentBy == null) {
            System.out.println("acceptFriendshipRequest(): user does not exists on XML!");
            return false;
        }//if

        MyLinkedQueue tempQueue = new MyLinkedQueue();
        while (!userSentTo.getRequests().isEmpty()) {
            Request currentRequest = (Request) userSentTo.getRequests().delete();
            if (currentRequest.getSentBy().equals(sentBy)) {
                currentRequest.setState(1);
            }//if
            tempQueue.insert(currentRequest);
        }//while
        userSentTo.setRequests(tempQueue);
        userSentTo.getFriends().addEnd(sentBy);
        userSentBy.getFriends().addEnd(sentTo);
        saveUser(userSentTo);
        saveUser(userSentBy);
        JFWindow.socialWebCore.setUsersGraph(JFWindow.socialWebCore.getUserBusiness().loadGraph());
//        JFWindow.socialWebCore.getUsersGraph().addEdge(sentTo, sentBy);
//        JFWindow.socialWebCore.getGraphData().saveGraph(JFWindow.socialWebCore.getUsersGraph());
        return true;
    }//acceptFriendshipRequest
    
    
    public boolean deleteFriendshipRequest(String sentTo, String sentBy) throws IOException, CloneNotSupportedException {
        User userSentTo = loadUser(sentTo);
        User userSentBy = loadUser(sentBy);

        if (userSentTo == null || userSentBy == null) {
            System.out.println("deleteFriendshipRequest(): user does not exists on XML!");
            return false;
        }//if

        MyLinkedQueue tempQueue = new MyLinkedQueue();
        while (!userSentTo.getRequests().isEmpty()) {
            Request currentRequest = (Request) userSentTo.getRequests().delete();
            if (currentRequest.getSentBy().equals(sentBy)) {
                currentRequest.setState(-1);
            }//if
            tempQueue.insert(currentRequest);
        }//while
        userSentTo.setRequests(tempQueue);
        saveUser(userSentTo);
        saveUser(userSentBy);
        return true;
    }//deleteFriendshipRequest

    public MyListGraph loadGraph() {
        MyListGraph graph = new MyListGraph();

        List<Element> vertexesList = this.root.getChildren();

        for (Element eVertex : vertexesList) {
            graph.addVertex(eVertex.getName());
        }//for

        for (Element eVertex : vertexesList) {
            List<Element> eEdges = eVertex.getChild(ElementsXML.FRIENDS).getContent();
            for (Element eEdge : eEdges) {
                if (!graph.existEdge(eVertex.getName(), eEdge.getAttributeValue(ElementsXML.USERNAME))) {
                    graph.addEdge(eVertex.getName(), eEdge.getAttributeValue(ElementsXML.USERNAME));
                }//if
            }//for
        }//for

        return graph;
    }//loadGraph

    public MyLinkedStack loadFriendsPosts(String user) throws IOException, CloneNotSupportedException {
        MyLinkedStack friendsPosts = new MyLinkedStack();
        
        User loggedUser = loadUser(user);
        MyDoubleLinkedList loggedUserFriendsName = loggedUser.getFriends();
        MyDoubleLinkedList loggedUserFriendsObjects = new MyDoubleLinkedList();
        
        for (int i = 1; i <= loggedUserFriendsName.getSize(); i++) {
            loggedUserFriendsObjects.addEnd(loadUser((String)loggedUserFriendsName.getByPosition(i)));
        }//for
        
        for (int i = 1; i <= loggedUserFriendsObjects.getSize(); i++) {
            while (!((User)loggedUserFriendsObjects.getByPosition(i)).getPosts().isEmpty()) {                
                friendsPosts.push(((User)loggedUserFriendsObjects.getByPosition(i)).getPosts().pop());
            }//while
        }//for
        
        System.out.println("Posts de mis amigos: "+friendsPosts.getSize());
        
        return friendsPosts;
    }//loadFriendsPosts


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
