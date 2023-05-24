
package DataStructures;

public class MyDoubleLinkedList{

    public Node start;

    public MyDoubleLinkedList() {
        this.start=null;
    }
    
    public void cancel() {
        this.start=null;  
    }//cancel

    public int getSize() {
        if(isEmpty())return 0;
        Node aux = start;
        int counter = 0;
        while(aux!=null){
            aux = aux.next;
            counter++;
        }//while
        return counter;
    }//getSize

    public boolean isEmpty() {
       return this.start == null;
    }//isEmpty

    public boolean exists(Object element) {
        Node aux = start;
        while(aux!=null){
            if(aux.element.equals(element))return true;
            aux = aux.next;
        }//while
        return false;
    }//exists

    public void addHead(Object element) {
        Node tempForStart = start;        
        start = new Node(element);;
        start.next = tempForStart;
    }//addHead

    public void addEnd(Object element) {
        Node newNode = new Node(element);
        if (isEmpty()){
            start = new Node(element);
        }else{
            Node aux = start;
            while (aux.next!=null) {
                aux = aux.next;
            }//while
            aux.next = newNode;
            newNode.previus = aux;
        }//if
    }//addEnd

    public void deleteByElement(Object element) {
        for (int i = 1; i <= getSize(); i++) {
            if (this.getByPosition(i).equals(element)) {
                if (i>1) {
                    getNode(i-1).next = getNode(i+1);
                    getNode(i+1).previus = getNode(i-1);
                }else{
                    start = getNode(2);
                }//if
                break;
            }//if
        }//for 
    }//deleteByElement

    public Object getByPosition(int position) {
        Node aux = start;
        for (int i = 1; i < position; i++) {
            aux = aux.next;
        }//for
        return aux.element;
    }//getByPosition
    
    public Node getNode(int position) {
        Node aux = start;
        for (int i = 1; i < position; i++) {
            aux = aux.next;
        }//for
        return aux;
    }//getNode

    public Object lastInList() {
        Node aux = start;
        while(aux.next!=null){
            aux = aux.next;
        }//while
        return aux.element;    
    }//lastInList
    
    public Object firstInList() {
        return start.element;
    }//firstInList

    
    //classes
    class Node {
    
        public Object element;
        public Node previus;
        public Node next;

        public Node(Object element) {
            this.element = element;
            this.next = null;
            this.previus= null;
        }

        @ Override
        public String toString() {
            return "Node{" + "element=" + element + ", previus=" + previus + ", next=" + next + '}';
        }
  
    }//class
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }//clone
    
}//class
