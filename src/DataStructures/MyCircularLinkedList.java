package DataStructures;

public class MyCircularLinkedList {

    public Node start;
    public Node end;

    public MyCircularLinkedList() {
        this.start = null;
        this.end = null;
    }

    public void cancel() {
        this.start = null;
        this.end = null;
    }//cancel

    public int getSize() {
        if (isEmpty()) {
            return 0;
        }
        Node aux = start;
        int counter = 1;
        while (aux.next != start) {
            aux = aux.next;
            counter++;
        }//while
        return counter;
    }//getSize

    public boolean isEmpty() {
        return this.start == null;
    }//isEmpty

    public boolean exists(Object element) {
        if (isEmpty()) {
            throw new ExceptionList("List does not exist");
        }
        Node aux = start;
        if (end.element.equals(element)) {
            return true;
        }
        while (aux.next != start) {
            if (aux.element.equals(element)) {
                return true;
            }
            aux = aux.next;
        }//while
        return false;
    }//exists

    public void insert(Object element) {
        Node inserted = new Node(element);
        if (this.isEmpty()) {
            start = inserted;
            start.next = end = start;
        } else {
            end = inserted;
            getNode(getSize()).next = inserted;
            inserted.next = start;
        }//if
    }//insert

    public int getByElement(Object element) {
        Node aux = start;
        for (int i = 1; i <= getSize(); i++) {
            if (aux.element.equals(element)) {
                return i;
            }
            aux = aux.next;
        }//for
        return -1;
    }//getByElement

    public void deleteByElement(Object element) {
        for (int i = 1; i <= getSize(); i++) {
            if (this.getNode(i).element.equals(element)) {
                if (i > 1) {
                    this.getNode(i - 1).next = this.getNode(i + 1);
                } else {
                    start = this.getNode(2);
                    end.next = start;
                }//if
                break;
            }//if
        }//for
    }//deleteByElement

    public Node getNode(int position) {
        Node aux = start;
        for (int i = 1; i < position; i++) {
            aux = aux.next;
        }//for
        return aux;
    }//getNode

    public Object firstInList() {
        return start.element;
    }//firstInList

    public Object lastInList() {
        return end.element;
    }//lastInList

    //classes
    class Node {

        public Object element;
        public Node next;

        public Node(Object element) {
            this.element = element;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node element: " + element;
        }

    }//class

    public class ExceptionList extends RuntimeException {

        public ExceptionList(String message) {
            super(message);
        }

    }//class

}//class
