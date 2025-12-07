public class SinglyCircularLL{
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        } 
    }

    public static void display(Node head){
    if(head==null) return;//empty list
    Node temp=head;
    do{
        System.out.print(temp.val+" ");
        temp=temp.next;
    }while(temp!=head);
    System.out.println();
}

    
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=a;
        display(a);

    }
}