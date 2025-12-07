

public class CPointminMaxLL {
    public static class Node {
        int val;
        Node next;
        @SuppressWarnings("unused")
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    public static int maxminDistance(Node head) {
        if (head==null) return -1;

        // Step 1: Find max and min values in the list
        int maxVal=head.val;
        int minVal=head.val;
        Node temp=head;
        while (temp!=null) {
            if (temp.val>maxVal) maxVal=temp.val;
            if (temp.val<minVal) minVal=temp.val;
            temp=temp.next;
        }

        // Step 2: Find positions (indexes) of first max and first min nodes
        int pos=0;
        int maxPos=-1;
        int minPos=-1;
        temp=head;
        while (temp != null) {
            if (temp.val == maxVal && maxPos == -1) maxPos = pos;
            if (temp.val == minVal && minPos == -1) minPos = pos;
            temp = temp.next;
            pos++;
        }

        // Step 3: Distance = absolute difference between positions
        return Math.abs(maxPos-minPos);
    }

    public static void display(Node head) {
        Node temp=head;
        while(temp!=null) {
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
        a.prev=null;a.next=b;
        b.prev=a;b.next=c;
        c.prev=b;c.next=d;
        d.prev=c;d.next=e;
        e.prev=d;e.next=null;

        display(a);

        int distance=maxminDistance(a);
        System.out.println("Distance between Max and Min nodes = "+distance);
    }
}
