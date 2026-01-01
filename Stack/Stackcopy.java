import java.util.*;
public class Stackcopy{
        @SuppressWarnings("SizeReplaceableByIsEmpty")//ye bus jo hum size use kar rahe hai empty ki jagah uske liye use ho raha hai 
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    Stack<Integer> st=new Stack<>();
	    for(int i=0;i<n;i++){
	        int x=sc.nextInt();
	        st.push(x);
	    }
	    System.out.println(st);
	    Stack<Integer> rt=new Stack<>();
	    while(st.size()>0){
	        rt.push(st.pop());
	    }
	    System.out.println("suported stack:"+rt);
	    
	    Stack<Integer> ct=new Stack<>();
	    while(rt.size()>0){
	        ct.push(rt.pop());
	    }
	    System.out.println("original copy stack:"+ct);
	}
}
