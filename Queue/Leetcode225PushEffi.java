import java.util.*;
public class Leetcode225PushEffi{
    static class MyStack{  
    Queue<Integer> q=new LinkedList<>();
    public void push(int val){
        q.add(val);
    }
    public int peek(){
        for(int i=1;i<=q.size()-1;i++){
            q.add(q.remove());
        }
        int val=q.peek();
        q.add(q.remove());
        return val;
    }
    public boolean empty(){
        if(q.size()==0){ 
            return true;
        }else return false;
    }
    public int pop(){
        for(int i=1;i<=q.size()-1;i++){
            q.add(q.remove());
        }
        int val=q.peek();
        q.remove();
        return val;
    }
}
    
    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(1);
        st.push(2);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.empty());
    }
}