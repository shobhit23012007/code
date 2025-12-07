
public class BasicLL{
    public static class Node{
        int data;//value
        Node next;//next element ka address
        Node(int data){//Node 2 guna space leti hai (value+next ka address)
            this.data=data;
        }
    }
        public static void InsertAtEnd(Node head,int val){
            Node temp=new Node(val);
            Node t=head;
            while(t.next!=null){
                t=t.next;
            }
            t.next=temp;
        }
        public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
     }
    
    public static void main(String[] args) {
        //Node x=new Node();
        // System.out.println(x.data);//0 (bina constructor ke print karne par)
        // System.out.println(x);//BasicLL$Node@2f92e0f4
        //System.out.print(x.next);//null

        //constructor ban ne ke bad
        Node a=new Node(5);
        //System.out.println(a.next);//null
        Node b=new Node(3);
        Node c=new Node(9);
        Node d=new Node(8);
        //5 3 9 8
        a.next=b;//5->3 9 8

        //Address dega ye
        // System.out.println(a);//BasicLL$Node@2f92e0f4 (a ka add.)
        // System.out.println(a.next);//BasicLL$Node@28a418fc (b ka add.)
        // System.out.println(b);//BasicLL$Node@28a418fc (b ka add.)
        // System.out.println(c);//BasicLL$Node@5305068a (c ka add.)

        System.out.println(a.data);//5
        System.out.println(b.data);//3
        System.out.println(a.next.data);//3 (b ki value)

        //connection
        a.next=b;//5->3 9 8
        b.next=c;//5->3->9 8
        c.next=d;//5->3->9->8 
        System.out.println(a.next);

        InsertAtEnd(a,87);
        display(a);
        
    }
}