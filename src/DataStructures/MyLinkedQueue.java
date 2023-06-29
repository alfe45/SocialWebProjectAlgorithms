package DataStructures;

public class MyLinkedQueue implements Cloneable {

    private Node start;
    private Node end;

    public MyLinkedQueue() {
        this.start = null;
        this.end = null;
    }

    public int getSize() {

        int count = 0;
        Node aux = start;//inicio de la cola

        if (isEmpty()) {
            return 0;
        }//if

        while (aux != null) {
            count++;
            aux = aux.next;
        }//finWhile

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
        if (isEmpty()) {
            this.start = newNode;
            this.end = start;
        } else {
            this.end.next = newNode;
            this.end = newNode;
        }//if

    }//insert

    public Object delete() {
        if (isEmpty()) {
            throw new ExceptionQueue("La cola esta vacia");
        }//if
        Object element = start.element;
        start = start.next;
        return element;
    }//delete

    public Object firstElement() {
        if (this.start == null) {
            throw new ExceptionQueue("Queue is empty");
        }//if
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
            return "Node{" + "element=" + element + '}';
        }

    }//class

    public class ExceptionQueue extends RuntimeException {

        public ExceptionQueue(String message) {
            super(message);
        }

    }//class

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }//clone

}//class
