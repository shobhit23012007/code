public class nthNodeFromEnd{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    //ye tha last se value ko find karna 
        // public static Node nthNode(Node head,int n){//ye 2 bar travel karke phir answer dega
        //     int size=0;
        //     Node temp=head;
        //     while(temp!=null){
        //         size++;
        //         temp=temp.next;
        //     }
        //     int m=size-n+1;
        //     temp=head;
        //     for(int i=1;i<=m-1;i++){
        //         temp=temp.next;
        //     }
        //     return temp;
        // }

        public static Node nthNode2(Node head,int n){//ye 1 bar travel karke phir answer dega
            Node slow=head;
            Node fast=head;
            for(int i=1;i<=n;i++){
                fast=fast.next;
            }
            while(fast!=null){
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
        }

        //last se hum value ko delete kaise kare
        public static Node deleteNthFromEnd(Node head,int n){
            Node slow=head;
            Node fast=head;
            for(int i=1;i<=n;i++){
                fast=fast.next;
            }
            if(fast==null){//agar koi head ko hi delete karna chahe tab hum end se head ko samj ke karenge
                head=head.next;
                return head;
            }
            while(fast.next!=null){
                slow=slow.next;
                fast=fast.next;
            }
            slow.next=slow.next.next;
            return head;
        }
        public static void display(Node head){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(13);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(12);
        Node f=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        // Node q=nthNode(a,3);//5
        //Node q=nthNode2(a,3);//5
        //System.out.println(q.data);
        display(a);//100 13 4 5 12 10
        a=deleteNthFromEnd(a,6);//13 4 5 12 10 (100 yaha se hat jayega par hume a=deleteNthFromEnd(a,6) dena padega taki head humara pata rahe)
        display(a);
    }
}