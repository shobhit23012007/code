
import java.util.*;

public class ReorderQueueusingStack{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Queue size:");
        int n=sc.nextInt();//always even
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            q.add(x);
        }
        System.out.println("Queue is:"+q);//ex=1 2 3 4 5 6 7 8
        Stack<Integer> st=new Stack<>();
        while(q.size()>n/2){//step 1 for(int i=0;i<=q.size()/2;i++ )
            st.push(q.remove());//5 6 7 8       top 4 3 2 1 (stack me)
        }
        while(st.size()>0){//step 2  !st.isempty()
            q.add(st.pop());//5 6 7 8 4 3 2 1
        }
        while(q.size()>n/2){//step 3 for(int i=0;i<=q.size()/2;i++ )
            st.push(q.remove());//4 3 2 1      top 8 7 6 5 (stack me)
        }
        while(st.size()>0){//step 3 !st.isempty()
            //one by one pahle stack se phir queue se
            q.add(st.pop());//stack se
            q.add(q.remove());//queue se
        }//8 4 7 3 6 2 5 1


        while(q.size()>0){//step 5(!q.isempty()) reverse ke liye
            st.push(q.remove());
        }
        while(st.size()>0){//step 6(!st.isempty()) final answer queue ki help se
            q.add(st.pop());
        }
        System.out.println("After Queue is:"+q);
    }
}