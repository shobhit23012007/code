
//leetcode 2130
public class TwinSumLL{
    public static class Node {
      int val;
     Node next;
     Node(int val) {
     this.val = val; 
      }
    }
    public static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node agla=null;
        while(curr!=null){
            agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agla;
        }
        return prev;
    }
    public static int pairSum(Node head) {
       Node slow=head;
        Node fast=head;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=reverse(slow.next);
        int max=0;
        Node head1=head;
        Node head2=slow.next;
        while(head2!=null){
            int sum=head1.val+head2.val;
            if(max<sum){
                max=sum;
            }
            head1=head1.next;
            head2=head2.next;
        }
        return max;
    }
    public static void main(String[] args) {
        Node a=new Node(3);
		Node b=new Node(5);
		Node c=new Node(1);
		Node d=new Node(2);
        Node e=new Node(4);
		a.next=b;
		b.next=c;
		c.next=d;
        d.next=e;

        int result =pairSum(a);
        System.out.println("Maximum Twin Sum: "+result);
    }
}