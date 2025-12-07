public class Basic2ll{
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    public static void display1(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void displayrev(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
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
        e.next=null;
        display1(a);//head se
        displayrev(e);//tail se

    }
}