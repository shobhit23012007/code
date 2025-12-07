public class ReverseLLiter{
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static Node reverseList(Node head) {//iterative
        Node curr=head;
        if(head==null || head.next==null) return head;
        Node prev=null;
        Node agla=null;
        while(agla!=null || curr!=null){
            agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agla;
        }
        
        return prev;
    }
    public static void display(Node head){
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
        System.out.println();
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
        System.out.print("Original List:");
        display(a);
        Node newHead = reverseList(a);
        System.out.print("Reversed List:");
        display(newHead);
    }
}