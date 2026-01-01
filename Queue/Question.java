
import java.util.*;

public class Question{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Queue<Integer> q1=new LinkedList<>();//ArrayList
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            q1.add(x);//rear(push)-> 5 4 3 2 1 ->front(pop)
        }
        System.out.println(q1);
        Queue<Integer> q2=new LinkedList<>();
        while(q1.size()>0){
            System.out.print(q1.peek()+" ");
            q2.add(q1.poll());
        }

        System.out.println(q2);
        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }
        System.out.println(q1);
    }
}