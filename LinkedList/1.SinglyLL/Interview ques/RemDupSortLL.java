
//leetcode 83(list always a sorted order)
public class RemDupSortLL{
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static Node deleteDuplicates(Node head) {
        Node temp=head;
        if(temp.next==null) return head;
        while(temp!=null && temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            } 
            else{//(temp.next.val!=temp.val)
                temp=temp.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
		Node b=new Node(1);
		Node c=new Node(2);
		Node d=new Node(3);
        Node e=new Node(3);
        Node f=new Node(4);
        Node g=new Node(5);
        Node h=new Node(5);
		a.next=b;
		b.next=c;
		c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;

        Node res=deleteDuplicates(a);
        while(res!=null){
            System.out.print(res.val+" ");//(1 2 3 4 5)
            res=res.next;
        }
    }
}