
package DataStructures;

public class MyLinkedStack implements Cloneable{

    public Node top;
    public int count;
    
    public MyLinkedStack() {
        this.top = null;
        this.count = 0;
    }
    
    public int getSize() {
        return count;
    }//getSize

    public boolean isEmpty() {
        return count==0;
    }//isEmpty

    public void cancel() {
        count = 0;
        top = null;
    }//cancel

    public Object top() {
        return top.element;
    }//top

    public void push(Object element) {
        Node newNode = new Node(element);
        if (top == null) {
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }//if
        count++;
    }//push

    public Object pop() {
        if (isEmpty())throw new ExceptionStack("Stack is empty");
        Node aux = top;
        top = top.next;
        count--;
        return aux.element;
    }//pop
    
    class Node {

        public Object element;
        public Node next;

        public Node(Object element) {
            this.element = element;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" + "element=" + element+ '}';
        }

    }//class
    
    class ExceptionStack extends RuntimeException {

        public ExceptionStack(String message) {
            super(message);
        }
       
    }//class
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }//clone
    
}//class
