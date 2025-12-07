public class Rondomnode{
    public static class Node{
        int val;
        Node prev;
        Node next;
        Node(int val){
            this.val=val;
        }
        
    }
    public static void display(Node random){
        Node temp=random;
        //move this temp backwords to the head
        while(temp.prev!=null){
            temp=temp.prev;
        }
        //now temp is at head
        //print the list
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);
        a.prev=null;
        b.prev=a;
        c.prev=b;
        d.prev=c;
        e.prev=d;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(c);
    }
}