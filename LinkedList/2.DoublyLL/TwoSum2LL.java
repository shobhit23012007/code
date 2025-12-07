public class TwoSum2LL{
    public static class Node{
        int val;
        Node next;
        @SuppressWarnings("unused")
        Node prev;
        Node(int val){
            this.val=val;
        }
        
    }
    public static void twosum(Node head,int target){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node h=head;
        Node t=temp;
        while(h.val<t.val){
            if((h.val+t.val)==target){
                System.out.println(h.val+" "+t.val);
                break;
            }
            else if((h.val+t.val)>target) t=t.prev;//badi value se choti value ki taraf aayenge
            else h=h.next;//(h.val+t.val<taget)
        }
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
        Node b=new Node(5);
        Node c=new Node(8);
        Node d=new Node(9);
        Node e=new Node(13);
       
        b.prev=a;
        c.prev=b;
        d.prev=c;
        e.prev=d;
        a.prev=null;

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        display(a);
        twosum(a,12);

    }
}