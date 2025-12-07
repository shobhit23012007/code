
public class CycleNodeLL{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node hasCycle(Node head) {//kis node se cycle suru ho rahi hai 
        if(head==null || head.next==null){
            return null;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) break;
        }
        if(fast == null || fast.next == null){
            return null;
        }
        Node temp=head;
        while(temp!=slow){
            if(temp==null) return null;
            temp=temp.next;
            slow=slow.next;
        }
        return slow;
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
        
        Node cycleStart = hasCycle(a);
        if (cycleStart != null) {
            System.out.println("Cycle starts at node: " + cycleStart.data);
        } else {
         System.out.println("No cycle found.");
        }

	}
}