public class Insertion2LL{
    public static class Node{
        int val;
        Node next;
        @SuppressWarnings("unused")
        Node prev;
        Node(int val){
            this.val=val;
        }

        public Node() {
        }
    }
    public static Node insertionAtHead(Node head,int x){
        Node t=new Node(x);//x instead of 30
        t.next=head;
        head=t;
        return head;
    }
    public static Node insertionAtTail1(Node head,Node tail,int x){
        //case 1st tail diya gya hai 
        Node t=new Node(x);
        tail.next=t;
        return head;
    }
    
    public static Node insertionAtTail2(Node head,int x){
        //case 2nd tail na diya gya hai 
        Node temp=head;
        Node t=new Node(x);
        while(temp.next!=null){ 
            temp=temp.next;
        }
            temp.next=t.next;
        return head;
    }

    public static Node insertionAtAnyIdx(Node head,int idx,int x){
        //2nd(best approch) extra Node se
        Node s=head;
        Node t=new Node(x);
        for(int i=0;i<idx;i++){//yaha while es liye nhi use hua kyuki hume iterarion pata hai ki kaha tak le jana hai
            s=s.next;
        }
            Node r=s.next;
            //ab value ko add karenge
            s.next=t;
            t.prev=s;
            t.next=r;

            return head;
    }

    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);
        a.prev=null;
        b.prev=a;
        c.prev=b;
        d.prev=c;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        //original ll==(4 10 2 99 13)
        display(a);//4 10 2 99 13

        Node newHead=insertionAtHead(a,10);
        display(newHead);//10 4 10 2 99 13

        Node newTail1=insertionAtTail1(a,e,10);
        display(newTail1);//4 10 2 99 13 10

        Node newTail2=insertionAtTail2(a,10);
        display(newTail2);//4 10 2 99 13 10

        Node newVal=insertionAtAnyIdx(a,3,50);
        display(newVal);//4 10 2 99 50 13 10
    }
}