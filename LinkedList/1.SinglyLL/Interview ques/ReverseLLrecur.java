
//leetcode 206
public class ReverseLLrecur{//T.C.=O(n) & S.c.=O(n)
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static Node reverseRecursive(Node head){//by function
        //base case
        if(head==null || head.next==null) return head;
        //call
        Node temp=reverseRecursive(head.next);//reverse kar rehe hai hum head ke aage ki vakue
        head.next.next=head;//interchange(or connection change)
        head.next=null;
        return temp;

    }

    public static void display(Node head){
        if(head==null) return;
        System.out.print(head.val+" ");// sidi value print hogi(3 5 1 2 4)
        display(head.next);
    }

    // public static void displayrev(Node head){
    //     if(head==null) return;
    //     displayrev(head.next);
    //     System.out.print(head.val+" ");//reverse hoker value print hogi(4 2 1 5 3)
    // }

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
        display(a);
        System.out.println(); 
       a=reverseRecursive(a);
       display(a);

    }
}