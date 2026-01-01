import java.util.*;
public class DeletionInStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("Original Stack: "+st);
        int idx=2;
        Stack<Integer> temp=new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.pop();
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.print(st+" ");
    }
}
