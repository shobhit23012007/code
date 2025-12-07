
public class CycleLL{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static boolean hasCycle(Node head) {
        if(head==null) return false;
        if(head.next==null){
            return false;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null){
            if(slow==null) return false;
            slow=slow.next;
            if(fast.next==null) return false;
            fast=fast.next.next;
            if(fast==slow) return true;
        }
        return false;
    }
    public static void main(String[] args) {
		Node a=new Node(100);
		Node b=new Node(13);
		Node c=new Node(4);
		Node d=new Node(6);
		Node e=new Node(12);
		Node f=new Node(10);
		Node g=new Node(15);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=f;
		f.next=g;

        g.next=c;//15 connected to 4
		System.out.println(a.data);//100
        if (hasCycle(a)){
            System.out.println("Cycle detected");
        }else
            System.out.println("No cycle");
	}
}