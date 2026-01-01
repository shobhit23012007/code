
public class StackbyLinkedList {
    public static class Stack{
    // Node class
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    // Top pointer
    Node top = null;
    // Push Operation
    public void push(int x){
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        System.out.print(x+" ");
    }
    // Pop Operation
    public int pop(){
        if(top == null){
            System.out.println("Stack Underflow!");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }
    // Peek Operation
    public int peek(){
        if(top == null){
            System.out.println("Stack is Empty!");
            return -1;
        }
        return top.data;
    }
    // Check empty
    public boolean isEmpty(){
        return top == null;
    }
    // Display Stack
    public void display(){
        if(top == null){
            System.out.println("Stack is empty!");
            return;
        }
        Node temp = top;
        System.out.print("Stack: ");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println("Popped: " + s.pop());
        //System.out.println("Peek: " + s.peek());
        //s.display();
    }
}
