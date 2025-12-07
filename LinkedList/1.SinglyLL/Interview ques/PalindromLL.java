
public class PalindromLL{
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static Node reverse(Node head){
        Node prev=null;
        Node agla=null;
        Node curr=head;
        while(curr!=null){
            agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agla;
        }
        return prev;
    }
    public static boolean isPalindrome(Node head) {
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp=reverse(slow.next);
        slow.next=temp;
        Node p1=head;
        Node p2=slow.next;
        while(p2!=null){
            if(p1.val!=p2.val) return false;
            if(p1.val==p2.val){
                p1=p1.next;
                p2=p2.next;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Node a=new Node(1);
		Node b=new Node(2);
		Node c=new Node(3);
		Node d=new Node(3);
        Node e=new Node(2);
        Node f=new Node(1);
		a.next=b;
		b.next=c;
		c.next=d;
        d.next=e;
        e.next=f;
        boolean res = isPalindrome(a);
        System.out.println("Is Palindrome: " + res);

    }
}