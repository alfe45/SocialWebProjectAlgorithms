
package DataStructures;

public class MyArrayQueue{
    
    private Object queue[];
    private int start;
    private int end;

    public MyArrayQueue(int n) {
        if (n <= 0)System.exit(0);
        this.queue = new Object[n];
        this.start = n-1;
        this.end = n-1;
    }

    public int getSize() {
        return end - start;
    }//getSize

    public boolean isEmpty() {
        return start == end;
    }//isEmpty

    public void cancel() {
        start = end;
    }//cancel

    public void insert(Object element) {
        if (getSize()== queue.length)throw new ExceptionQueue("Queue is full"); 
        if (end>0){
            this.queue[this.start] = element;
            this.start--;
        }//if
    }//insert

    public Object delete() {
        this.start++;
        Object aux = this.queue[this.end];
        if (isEmpty()) {
            throw new ExceptionQueue("The queue is empty");
        }else{
            for (int i = this.end; i > 0; i--) {
                this.queue[i] = this.queue[i-1];
            }//for
            this.queue[0] = null;
            return aux;
        }//if
    }//delete

    public Object firstElement() {
        for (int i = 0; i < queue.length; i++) {
            if (this.end == i)return this.queue[i];        
        }//for       
        return null;
    }//firstElement

    public int maxSize() {
        return queue.length;
    }//maxSize
    
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
