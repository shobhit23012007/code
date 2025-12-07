public class ByFunctionLL{
    public static void display(Node head){//recursive
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static class Node{
        int data;//value
        Node next;//next element ka address
        Node(int data){//Node 2 guna space leti hai (value+next ka address)
            this.data=data;
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

        //Node temp=a;//iterative
        // while(temp!=null){//jab head ki hi value pata ho tab (best approch)
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }

        display(a);
    }
}