package DataStructures;

public class MySimpleLinkedList {

    Node start;
    int counter;

    public MySimpleLinkedList() {
        this.start = null;
        this.counter = 0;
    }

    public int getSize() {
        return counter;
    }//getSize

    public void cancel() {
        start = null;
        counter = 0;
    }//cancel

    public boolean isEmpty() {
        return this.start == null;
    }//isEmpty

    public void insert(Object element) {
        if (this.isEmpty()) {
            start = new Node(element);
        } else {
            Node aux = start;
            while (aux.next != null) {
                aux = aux.next;
            }
            aux.next = new Node(element);
        }
        this.counter += 1;
    }//insert

    public Object getByPosition(int position) {
        Node temp = start;
        for (int i = 1; i < position; i++) {
            if (temp.next != null) {
                temp = temp.next;
            }//if   
        }//for
        return temp.element;
    }//getByPosition

    public void deleteByElement(Object element) {
        for (int i = 1; i <= counter; i++) {
            if (((Node) this.getByPosition(i)).element.equals(element)) {
                deleteByPosition(i);
                break;
            }//if
        }//for 
    }//deleteByElement

    public void deleteByPosition(int position) {
        if (position > 1) {
            ((Node) this.getByPosition(position - 1)).next = ((Node) this.getByPosition(position + 1));
        } else {
            start = (Node) this.getByPosition(2);
        }
        this.counter--;
    }//deleteByPosition

    public boolean exists(Object element) {
        for (int i = 1; i < counter; i++) {
            if (((Node) this.getByPosition(i)).element.equals(element)) {
                return true;
            }
        }//for
        return false;
    }//exist

    public Object firstInList() {
        return start.element;
    }//firstInList

    public Object lastInList() {
        return this.getByPosition(counter);
    }//lastInList

    //classes
    class Node {

        public Object element;
        public Node next;

        public Node(Object element) {
            this.element = element;
            this.next = null;
        }

    }//class
    
}//class
