package DataStructures;

public class MyCicularDoublyLinkedList {

    private Node start;
    private Node end;

    public MyCicularDoublyLinkedList() {
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
        if (!isEmpty()) {
            Node aux = start;
            if (end.element.equals(element)) {
                return true;
            }//if
            while (aux.next != start) {
                if (aux.element.equals(element)) {
                    return true;
                }
                aux = aux.next;
            }//while
        }//if
        return false;
    }//exists

    public void addHead(Object element) {
        Node tempForStart = start;
        start = new Node(element);;
        start.next = tempForStart;
        tempForStart.previus = start;
        start.previus = end;
        end.next = start;
    }//addHead

    public void addEnd(Object element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            start = end = new Node(element);
            start.next = start;
            start.previus = start;
        } else {
            Node aux = start;
            while (aux.next != start) {
                aux = aux.next;
            }//while
            aux.next = newNode;
            newNode.previus = aux;
            newNode.next = start;
            start.previus = newNode;
            end = newNode;
        }//if
    }//addEnd

    public void deleteByElement(Object element) {
        for (int i = 1; i <= getSize(); i++) {
            if (this.getNode(i).element.equals(element)) {
                if (i > 1) {
                    this.getNode(i - 1).next = this.getNode(i + 1);
                    this.getNode(i + 1).previus = this.getNode(i - 1);
                } else {
                    start = this.getNode(2);
                    this.getNode(2).previus = end;
                    end.next = start;
                }//if
                break;
            }//if
        }//for
    }//deleteByElement

    public Object getByPosition(int position) {
        if (position < 0 || position > getSize()) {
            return null;
        }

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
    }//getByPosition

    public Object lastInList() {
        return end.element;
    }//lastInList

    public Object firstInList() {
        return start.element;
    }//firstInList

    //classes
    class Node {

        private Object element;
        private Node previus;
        private Node next;

        public Node(Object element) {
            this.element = element;
            this.next = null;
            this.previus = null;
        }

        @Override
        public String toString() {
            return "Node{" + "element=" + element + '}';
        }

    }//class

    class ExceptionList extends RuntimeException {

        public ExceptionList(String message) {
            super(message);
        }

    }//class

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }//clone

}//class
