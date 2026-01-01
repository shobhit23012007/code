import java.util.Stack;
public class insertionInStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("Original Stack: "+st);
        int idx=2;
        int data=25;
        //insertAtBottom(st,data);
        Stack<Integer> temp=new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(data);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.print(st+" ");
    }
    
    // public static void insertAtBottom(Stack<Integer> st, int data) {
    //     if(st.isEmpty()) {
    //         st.push(data);
    //         return;
    //     }
    //     int top = st.pop();
    //     insertAtBottom(st, data);
    //     st.push(top);
    // }
}
