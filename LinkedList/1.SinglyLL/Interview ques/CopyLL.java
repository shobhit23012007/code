
public class CopyLL{
    public static class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
    public static Node copyRandomList(Node head) {
        Node head2=new Node(0);
        Node temp2=head2;
        Node temp1=head;
        //creating deep copy
        while(temp1!=null){
            Node t=new Node(temp1.val);
            temp2.next=t;
            temp2=t;
            temp1=temp1.next;
        }
        head2=head2.next;
        temp2=head2;
        temp1=head;
    //step 2(Alternet connection)
        Node temp=new Node(-1);
        while(temp1!=null){
            temp.next=temp1;
            temp1=temp1.next;
            temp=temp.next;

            temp.next=temp2;
            temp2=temp2.next;
            temp=temp.next;
        }
        temp2=head2;
        temp1=head;
        //step3(Assigning random pointers)
        while (temp1 != null) {
           if (temp1.random != null){
          temp1.next.random = temp1.random.next;
        }else{
        temp1.next.random = null;
        temp1 = temp1.next.next;
        }
}

        temp2=head2;
        temp1=head;

        //step4(separating the list)
        while(temp1!=null){
        temp1.next=temp2.next;
        temp1=temp1.next;
        temp2.next=temp1.next;
        if(temp2.next==null) break;
        temp2=temp2.next;
        }
        return head2;
    }
    public static void main(String[] args) {
        Node n1 = new Node(7);
        Node n2 = new Node(13);
        Node n3 = new Node(11);
        Node n4 = new Node(10);
        Node n5 = new Node(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        n2.random = n1;
        n3.random = n5;
        n4.random = n3;
        n5.random = n1;
        Node cloneHead = copyRandomList(n1);
        Node temp = cloneHead;
    System.out.println("Cloned list:");
    while (temp != null) {
    System.out.print("Val: " + temp.val + ", Random: ");
    
    if (temp.random != null) {
        System.out.println(temp.random.val);
    } else {
        System.out.println("null");
    }
    
    temp = temp.next;
}

}
}