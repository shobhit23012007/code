

public class RecursiveLL{
    public static class Node{
        int data;//value
        Node next;//next element ka address
        Node(int data){//Node 2 guna space leti hai (value+next ka address)
            this.data=data;
        }
        public static void print(Node head){
            if(head==null) return;

            //Sidda print
            // System.out.print(head.data+" ");
            // print(head.next);//recursive call

            //revese me
            print(head.next);
            System.out.print(head.data+" ");
           
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(3);
        Node c=new Node(9);
        Node d=new Node(8);
        a.next=b;//5->3 9 8
        b.next=c;//5->3->9 8
        c.next=d;//5->3->9->8

        Node.print(a);//class ki help se

    }
}