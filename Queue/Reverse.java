
// import java.util.*;
//1.reverse total


// public class Reverse{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the queue size");
//         int n=sc.nextInt();
//         Queue<Integer> q=new LinkedList<>();//ArrayList
//         for(int i=0;i<n;i++){
//             int x=sc.nextInt();
//             q.add(x);
//         }
//         System.out.println("original queue is:"+q);
//         Stack<Integer> st=new Stack<>();
//         while(q.size()>0){//!q.isEmpty()
//         st.push(q.remove());
//         }
//         while(st.size()>0){//!st.isEmpty()
//             q.add(st.pop());
//         }
//         System.out.println("reverse queue is:"+q);
//     }
// }

//2.reverse k element

import java.util.*;

public class Reverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the queue size");
        int n=sc.nextInt();
        Queue<Integer> q=new LinkedList<>();//ArrayList
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            q.add(x);
        }
        System.out.println("original queue is:"+q);
        Stack<Integer> st=new Stack<>();
        int k=sc.nextInt();
        while(q.size()>=k){//!q.isEmpty()
        st.push(q.remove());
        }
        while(st.size()>0){//!st.isEmpty()
            q.add(st.pop());
        }
        System.out.println("reverse queue is:"+q);
        for(int i = 0; i < n - k; i++) {
            q.add(q.remove());
        }
        System.out.println("Reversed k element queue is: " + q);
    }
}