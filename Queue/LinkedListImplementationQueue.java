
import java.util.*;
public class LinkedListImplementationQueue{

       static class Node{
        int val;
        Node next;
        //private Node size;
        Node(int val){
            this.val=val;
        }
       }
        static class queueLL{
            Node head=null;
            Node tail=null;
            int size=0;

         public void add(int x){
            Node temp=new Node(x);
            if(size==0){
                head=tail=temp;
            }else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            size--;
            return x;
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }
        public boolean isEmpty(){
            if(size==0){
                System.out.println("Queue is full");
                return true;
            }else{
                return false;
            }
        }
        public void display(){
                if(size==0){
                System.out.println("Queue is full");
                return;
            }
            Node temp=head;
            while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
            }
                System.out.println();
            }
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        queueLL q=new queueLL();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            q.add(val);
        }
        q.display();
        q.remove();
        q.display();
    }
}