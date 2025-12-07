

public class PalindromLL{
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    public static Boolean palindrom(Node head){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node h=head;
        Node t=temp;
        while(h!=t && h.prev!=t){
            if(h.val!=t.val) return false;
            h=h.next;
            t=t.prev;
        }
        return true;
    }
    public static void display(Node head){
        Node temp=head;
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
        e.next=null;
        display(a);
       System.out.println(palindrom(a));
    }
}