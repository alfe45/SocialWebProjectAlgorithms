
package Domain;

import DataStructures.MyCicularDoublyLinkedList;
public class Post {

    private String date;
    private MyCicularDoublyLinkedList thoughts;
    
    public Post() {
        this.thoughts = new MyCicularDoublyLinkedList();
        this.date = "00:00 AM  00/00/00";
    }
    
    public void addThought(String thoughtText){
        if (this.thoughts.getSize()<=10)this.thoughts.addEnd(new Thought(thoughtText));
    }//addThought
    
    public String getThought(int index){
        return ((Thought)this.thoughts.getByPosition(index)).getText();
    }//getThought

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}//class
