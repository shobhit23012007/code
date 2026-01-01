import java.util.*;
public class Leetcode232PushEffi{
    static class MyQueue{  
        Stack<Integer> st=new Stack<>();
        Stack<Integer> helper=new Stack<>();
    
    public void push(int val){
        st.push(val);
    }
    public int peek(){
        while(st.size()>1){//!st.isEmpty()
            helper.push(st.pop());
        }
        int x=st.peek();
        while(helper.size()>0){//!helper.isEmpty()
            st.push(helper.pop());
        }
        return x;
    }
    public int pop(){
        while(st.size()>1){//!st.isEmpty()
            helper.push(st.pop());
        }
        int x=st.pop();
        while(helper.size()>0){//!helper.isEmpty()
            st.push(helper.pop());
        }
        return x;
    }
    public boolean empty(){
        if(st.size()==0){ //st.isEmpty()
            return true;
        }else return false;
    }
}
    
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(1);
        q.push(2);
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.empty());
    }
}