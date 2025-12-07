

//leetcode 21
public class MergeLL{//S.C.=O(n) extra node leke solve kiye hai
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    // public static Node mergeTwoLists(Node list1, Node list2){//esme 3 node use ho rahe the
    //     Node temp1=list1;
    //     Node temp2=list2;
    //     Node head=new Node(100);
    //     Node temp3=head;
    //     while(temp1!=null && temp2!=null){
    //         if(temp1.val<=temp2.val){
    //             Node a=new Node(temp1.val);
    //             temp3.next=a;
    //             temp3=a;
    //             temp1=temp1.next;
    //         }else{
    //            Node a=new Node(temp2.val);
    //             temp3.next=a;
    //             temp3=a;
    //             temp2=temp2.next;
    //         }
    //     }
    //     if(temp1==null){
    //        temp3.next=temp2;
    //     }else{
    //         temp3.next=temp1;
    //     }
       
    //     return head.next;
    // }

    public static Node mergeTwoLists(Node list1, Node list2){//S.C=O(1) esme 2 hi node use honge
        Node t1=list1;
        Node t2=list2;
        Node h=new Node(100);
        Node t=h;
        while(t1!=null && t2!=null){
            if(t1.val<=t2.val){
                t.next=t1;
                t=t1;
                t1=t1.next;
            }else{
               t.next=t2;
                t=t2;
                t2=t2.next;
            }
        }
        if(t1==null){
           t.next=t2;
        }else{//t2 is null
            t.next=t1;
        }
       
        return h.next;
    }


    public static void main(String[] args) {
        Node a=new Node(1);
		Node b=new Node(3);
		Node c=new Node(5);
		Node d=new Node(8);
		a.next=b;
		b.next=c;
		c.next=d;

        Node A=new Node(2);
        Node B=new Node(4);
        Node C=new Node(6);
        Node D=new Node(7);
        A.next=B;
        B.next=C;
		C.next=D;
        Node merged=mergeTwoLists(a,A);
        Node temp=merged;
        while (temp!=null) {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
}