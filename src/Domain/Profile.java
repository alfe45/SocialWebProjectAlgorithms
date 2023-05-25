
package Domain;

import DataStructures.MyCicularDoublyLinkedList;
import DataStructures.MyDoubleLinkedList;
import DataStructures.MyLinkedQueue;
import DataStructures.MyLinkedStack;

public class Profile {
    
    private String name;
    
    private MyDoubleLinkedList friends;
    
    private MyLinkedQueue requests;
    
    private MyLinkedStack posts;


    public Profile(String name) {
        this.name = name;
        this.friends = new MyDoubleLinkedList();
        this.requests = new MyLinkedQueue();
        this.posts = new MyLinkedStack();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}//class
