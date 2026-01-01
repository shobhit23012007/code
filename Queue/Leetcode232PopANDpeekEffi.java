import java.util.*;

    class MyQueue{  
        Stack<Integer> st=new Stack<>();
        Stack<Integer> helper=new Stack<>();
    
    public void push(int val){
        if(st.size()==0){//st.isEmpty()
            st.push(val);
        }else{
            while(st.size()>0){//!st.isEmpty()
                helper.push(st.pop());
            }
            st.push(val);
            while(helper.size()>0){//!helper.isEmpty()
                st.push(helper.pop());
            }
        }
    }
    public int peek(){
        return st.peek();
    }
    public int pop(){
        return st.pop();
    }
    public boolean empty(){
        if(st.size()==0){ //st.isEmpty()
            return true;
        }else return false;
    }
}
    public class Leetcode232PopANDpeekEffi{
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(1);
        q.push(2);
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.empty());
    }
}