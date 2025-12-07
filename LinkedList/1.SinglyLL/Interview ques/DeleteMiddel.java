
//leetcode 2095
public class DeleteMiddel{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    // public static Node deleteMiddle1(Node head) {//right middle delete kare ga 
    //     if(head.next==null){
    //         return null;
    //     }
    //     Node slow=head;
    //     Node fast=head;
    //     while(fast.next.next!=null && fast.next.next.next!=null){
    //         slow=slow.next;
    //         fast=fast.next.next;
    //     }
    //     slow.next=slow.next.next;
    //     return head;
    // }

    public static Node deleteMiddle2(Node head){//left middle delete karega
        if(head.next==null){
            return null;
        }
        Node slow=head;
        Node fast=head;
        while(fast.next.next!=null && fast.next.next.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void printList(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        // System.out.println("null");
    }
    public static void main(String[] args) {
        Node a=new Node(100);
		Node b=new Node(13);
		Node c=new Node(4);
		Node d=new Node(6);
		Node e=new Node(12);
		Node f=new Node(10);
		//Node g=new Node(15);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=f;
		//f.next=g;

        // deleteMiddle1(a);
        // printList(a);
        System.out.println();
        deleteMiddle2(a);
        printList(a);
        
    }
}
