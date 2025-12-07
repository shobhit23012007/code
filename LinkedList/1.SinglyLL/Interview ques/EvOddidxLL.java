


public class EvOddidxLL{
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static Node evenodd(Node head){//extra space le raha hai
        Node t1=head;
        Node odd=new Node(-1);
        Node tempo=odd;
        Node even=new Node(0);
        Node tempe=even;
            while(t1!=null){
                tempo.next=t1;
                tempo=tempo.next;
                t1=t1.next;

                tempe.next=t1;
                if(t1==null) break;
                tempe=tempe.next;
                t1=t1.next;
            }
            odd=odd.next;
            even=even.next;
            tempo.next=even;
        
        return odd;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
		Node b=new Node(2);
		Node c=new Node(8);
		Node d=new Node(5);
		a.next=b;
		b.next=c;
		c.next=d;
        //(1 2 8 5)->(1 5 2 8)

        Node result=evenodd(a);
        Node temp=result;
        while (temp!=null) {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
}

