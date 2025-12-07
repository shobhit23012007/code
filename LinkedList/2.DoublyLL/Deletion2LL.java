

public class Deletion2LL{
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    public static Node DelitionAtHead(Node head){
        head=head.next;
        head.prev=null;
        return head;
    }
    public static Node DeletionAtTail1(Node head,Node tail){
        //case 1st tail diya gya hai 
        Node temp=tail;
        temp=temp.prev;
        temp.next=null;
        return head;
    }
    
    public static Node DeletionAtTail2(Node head){
        //case 2nd tail na diya gya hai 
        Node temp=head;
        while(temp.next!=null){ 
            temp=temp.next;
        }
            temp=temp.prev;
           temp.next=null;
        return head;
    }

    public static Node DeletionAtAnyIdx(Node head, int idx){
    if(idx==0){
        return DelitionAtHead(head);
    }
    Node temp=head;
    for(int i=0;i<idx-1;i++){//temp ko previous node tak le jao
        temp=temp.next;
    }
    Node toDelete=temp.next;
    if(toDelete.next!=null){
        toDelete.next.prev=temp;
    }
    temp.next=toDelete.next; // last node delete karte time temp.next = null ho jayega
    return head;
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
        //original ll==(4 10 2 99 13)
        display(a);//4 10 2 99 13

        Node newHead=DelitionAtHead(a);
        display(newHead);//10 2 99 13

        Node newTail1=DeletionAtTail1(a,e);
        display(newTail1);//4 10 2 99

        Node newTail2=DeletionAtTail2(a);
        display(newTail2);//4 10 2

        Node newVal=DeletionAtAnyIdx(a,1);
        display(newVal);//4 2
    }
}