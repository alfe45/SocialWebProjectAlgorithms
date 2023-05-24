
package DataStructures;

public class MyArrayStack implements Cloneable{
    
    private Object stack[];
    private int top;

    public MyArrayStack(int n) {
        if (n<=0)System.exit(0);
        stack = new Object[n];
        top = -1; 
    }

    public int getSize() {
        return top+1;
    }//getSize

    public boolean isEmpty() {
        return top<0;
    }//isEmpty

    public void cancel() {
        top=-1;
    }//cancel

    public Object top() {
        return stack[top];
    }//top

    public void push(Object element) {
        if (getSize()== stack.length)throw new ExceptionStack("Stack is full"); 
        stack[++top] = element;
    }//push

    public Object pop() {
        if (isEmpty())throw new ExceptionStack("Stack is empty"); 
        return stack[top--];
    }//pop
    
    public int maxSize(){
        return stack.length;
    }//maxSize
    
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
