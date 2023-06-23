package Domain;

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

    public MyLinkedQueue getRequests() {
        return requests;
    }

    public MyLinkedStack getPosts() {
        return posts;
    }

    public void sendFriendRequest(Profile targetProfile) {
        System.out.println(this.name+ " : New friend request sent to: " + targetProfile.getName());
        targetProfile.receiveRequest(new Request("Today", this.name, targetProfile.getName()));
    }//sendFriendRequest

    public void receiveRequest(Request newRequest) {
        this.requests.insert(newRequest);
        System.out.println(this.name+ " : New friend request received from: " + newRequest.getSentBy());
    }//receiveRequest

}//class
