public class DisplayLL{
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

        //Normal approch a se hi sab printing

        // System.out.println(a.data);//5(a)
        // System.out.println(a.next.data);//3(b)
        // System.out.println(a.next.next.data);//9(c)
        // System.out.println(a.next.next.next.data);//8(d)
        
       // Node temp=a;

        // for(int i=1;i<=4;i++){//jab puri value pata ho ta for use karenge
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }

        // while(temp!=null){//jab head ki hi value pata ho tab (best approch)
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }


        //bina extra node banaye 
        while(a!=null){//esse humara head gayab ho jayega(drawback)
            System.out.print(a.data+" ");
            a=a.next;
        }
    }
}