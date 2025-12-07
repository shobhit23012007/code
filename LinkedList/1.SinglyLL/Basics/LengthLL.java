public class LengthLL{
    
    public static class Node{
        @SuppressWarnings("unused")
        int data;//value
        Node next;//next element ka address
        Node(int data){//Node 2 guna space leti hai (value+next ka address)
            this.data=data;
        }
    }
    // public static int length(Node head){//iterative
    //     int count=0;
    //     while(head!=null){
    //         count++;
    //         head=head.next;
    //     }
    //     return count;
    // }

    public static int length(Node head) {//revursive
    if (head == null) {
        return 0; // base case
    }
    return 1 + length(head.next); // recursive step
}

    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(3);
        Node c=new Node(9);
        Node d=new Node(8);
        a.next=b;//5->3 9 8
        b.next=c;//5->3->9 8
        c.next=d;//5->3->9->8 

       int len=length(a);
       System.out.println("Length of LL is:"+len);
    }
}