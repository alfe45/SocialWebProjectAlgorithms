package Domain;

import DataStructures.MyDoubleLinkedList;
import DataStructures.MyLinkedQueue;
import DataStructures.MyLinkedStack;

public class User {

    private String nickname;

    private String username;
    
    private String password;

    private MyDoubleLinkedList friends;

    private MyLinkedQueue requests;

    private MyLinkedStack posts;
    
    public int priority;

    public User(String username, String password) {
        this.nickname = "NAME";
        this.username = username.toLowerCase();
        this.password = password;
        this.friends = new MyDoubleLinkedList();
        this.requests = new MyLinkedQueue();
        this.posts = new MyLinkedStack();
        this.priority = 0;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public MyDoubleLinkedList getFriends() {
        return friends;
    }

    public void setFriends(MyDoubleLinkedList friends) {
        this.friends = friends;
    }

    public MyLinkedQueue getRequests() {
        return requests;
    }

    public void setRequests(MyLinkedQueue requests) {
        this.requests = requests;
    }

    public MyLinkedStack getPosts() {
        return posts;
    }

    public void setPosts(MyLinkedStack posts) {
        this.posts = posts;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "User{" + "nickname=" + nickname + ", username=" + username + ", password=" + password + ", friends=" + friends.getSize() + ", requests=" + requests.getSize() + ", posts=" + posts.getSize() + '}';
    }

}//class
