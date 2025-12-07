

//leetcode 160
public class Intersection2LL{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node inter(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;
        int len1=0;
        int len2=0;
        while(temp1!=null){
            temp1=temp1.next;
            len1++;
        }
        while(temp2!=null){
            temp2=temp2.next;
            len2++;
        }
        temp1=head1;
        temp2=head2;
        if(len1>len2){
            int diff=len1-len2;
            for(int i=0;i<diff;i++){
               temp1=temp1.next; 
            }
        }else{
            int diff=len2-len1;
            for(int i=0;i<diff;i++){
                temp2=temp2.next;
            }
        }
        
        while(temp1!=null && temp2!=null){
            if(temp1==temp2){
            System.out.print("Intersection part is:"+temp1.data);
            return temp1;
            }
            temp1=temp1.next;
            temp2=temp2.next;
            
        }
        System.out.print("no intersection");
        return null;
    }
	public static void main(String[] args) {
		Node a=new Node(87);
		Node b=new Node(100);
		Node c=new Node(13);
		Node d=new Node(4);
		Node e=new Node(5);
        Node f=new Node(12);
        Node g=new Node(10);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
        e.next=f;
        e.next=f;
        f.next=g;
        //87 100 13 4 5 12 10 
		
		Node A=new Node(90);
		Node B=new Node(9);
		A.next=B;
		B.next=e;
        //90 9 5 12 10
		inter(a,A);
	}
}
