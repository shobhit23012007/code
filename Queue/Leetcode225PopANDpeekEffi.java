import java.util.*;

    class MyStack{  
    Queue<Integer> q=new LinkedList<>();
    public void push(int val){
        if(q.size()==0){
            q.add(val);
        }else{
            q.add(val);
            for(int i=1;i<=q.size()-1;i++){
                q.add(q.remove());
            }
        }
    }
    public int peek(){
        return q.peek();
    }
    public int pop(){
        return q.remove();
    }
    public boolean empty(){
        if(q.size()==0){ 
            return true;
        }else return false;
    }
}
    public class Leetcode225PopANDpeekEffi{
    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(1);
        st.push(2);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.empty());
    }
}