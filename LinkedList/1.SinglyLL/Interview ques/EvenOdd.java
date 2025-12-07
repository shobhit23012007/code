
//leetcode 328
public class EvenOdd{
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static Node evenodd(Node head){//extra space le raha hai
        Node t1=head;
        Node odd=new Node(-1);
        Node tempo=odd;
        Node even=new Node(0);
        Node tempe=even;
        while(t1!=null){
            if(t1.val%2!=0){
                tempo.next=t1;
                tempo=tempo.next;
                t1=t1.next;
            }else{
                tempe.next=t1;
                tempe=tempe.next;
                t1=t1.next;
            }
        }
        tempe.next=null;
        tempo.next=even.next;
        return odd.next;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
		Node b=new Node(2);
		Node c=new Node(8);
		Node d=new Node(5);
		a.next=b;
		b.next=c;
		c.next=d;
        //(1 2 8 5)->(1 5 2 8)

        Node result=evenodd(a);
        Node temp=result;
        while (temp!=null) {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
}

//leetcode solution
// class Solution {
//     public ListNode oddEvenList(ListNode list1) {
//         if (list1 == null) return null;

//         ListNode t1 = list1;
//         ListNode o = new ListNode(-1); // odd index dummy
//         ListNode tempo = o;
//         ListNode e = new ListNode(0);  // even index dummy
//         ListNode tempe = e;

//         int pos = 1; // start position from 1
//         while (t1 != null) {
//             if (pos % 2 != 0) { // odd index node
//                 tempo.next = t1;
//                 tempo = tempo.next;
//             } else { // even index node
//                 tempe.next = t1;
//                 tempe = tempe.next;
//             }
//             t1 = t1.next;
//             pos++;
//         }

//         tempe.next = null;     // end even list
//         tempo.next = e.next;   // connect odd → even
//         return o.next;
//     }
// }
