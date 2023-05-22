
package DataStructures;

public class MyLinkedQueue{

    private Node start;
    private Node end;
    
    public MyLinkedQueue() {
        this.start = null;
        this.end = null;
    }
    
    public int getSize() {
        if (isEmpty())return 0;
        int count = 0;
        Node aux = start;
        while (aux!=null) {
            aux = aux.next;
            count++;
        }//while
        return count;
    }//getSize

    public boolean isEmpty() {
        return start == null;
    }//isEmpty

    public void cancel() {
        this.start = null;
        this.end = null;
    }//cancel

    public void insert(Object element) {
        Node newNode = new Node(element);
        if (start == null) {
            this.start = newNode;
            this.end = newNode;
        }//if
        this.end.next = newNode;
        this.end = newNode;
    }//insert

    public Object delete() {
        if (this.start == null) {
            throw new ExceptionQueue("La cola esta vacia");
        }else{
            if (this.start.next == null) {
                Object aux = this.start.element;
                cancel();
                return aux;
            }//if
        }//if
        Node aux = this.start;
        this.start = start.next;
        return aux.element;
    }//delete

    public Object firstElement() {
        if (this.start == null) throw new ExceptionQueue("Queue is empty");
        return start.element;
    }//firstElement
    
    //classes
    
    public class Node {

        public Object element;
        public Node next;
        public Node previous;

        public Node(Object element) {
            this.element = element;
            this.next = null;
            this.previous = null;
        }

        @Override
        public String toString() {
            return "Node{" + "element=" + element+ '}';
        }

    }//class
    
    public class ExceptionQueue extends RuntimeException {

        public ExceptionQueue(String message) {
            super(message);
        }
    
    }//class
    
}//class
