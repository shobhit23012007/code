

//leetcode 876
public class MiddleLL{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    // public static Node middle(Node head){//es code me hum 1.5 bar travel kar rahe hai 
    //     Node temp=head;
    //     int len=0;
    //     while(temp!=null){
    //         len++;
    //         temp=temp.next;
    //     }
    //     int mid=(len-1)/2;
    //     temp=head;
    //     for(int i=0;i<mid;i++){
    //         temp=temp.next;
    //     }
    //     System.out.print(temp.data);
    //         temp=temp.next;
    //         return temp;
    // }
    
    public static Node middle(Node head){//fast ko 2x se chalayenge
        Node fast=head;
        Node slow=head;
        // while(fast.next!=null && fast.next.next!=null){//left middle (4)
        //     fast=fast.next.next;
        //     slow=slow.next;
        // }
        
        
        //  while(fast.next!=null){//odd middle (6)
        //     fast=fast.next.next;
        //     slow=slow.next;
        // }
        
        
        while(fast!=null && fast.next!=null){//right middle (6)
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.print(slow.data);
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
		middle(a);
		
	}
}
