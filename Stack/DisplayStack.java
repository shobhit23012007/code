import java.util.Stack;
public class DisplayStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        Stack<Integer> temp=new Stack<>();
        while(!st.isEmpty()){//st.size()>0
            temp.push(st.pop());
        }
        while(!temp.isEmpty()){
            int val=temp.pop();
            System.out.print(val+" ");
            st.push(val);
        }

        //array ke through
        // int n=st.size();
        // int[] arr=new int[n];
        // for(int i=n-1;i>=0;i--){
        //     arr[i]=st.pop();
        // }
        // System.out.println();
        // for(int i=0;i<n;i++){
        //     System.out.print("array ke through:"+arr[i]+" ");
        //     st.push(arr[i]);
        // }
        displayrec(st);
    }
    public static void displayrec(Stack<Integer> st){//pass by reference hota hai
        if(st.size()==0){
            return;
        }
        int val=st.pop();
       // System.out.print(val+" ");//40 30 20 10
        displayrec(st);
        System.out.print(val+" ");//10 20 30 40
        st.push(val);
    }
}
