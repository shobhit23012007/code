
import java.util.*;

public class Infix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("the question is:");//9-5+3*4/6
        String str=sc.next();
        Stack<Integer> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            //step 1st;
            if(ascii>=48 && ascii<=57) val.push(ascii-48); 
            //step 2nd;
            else if(op.size()==0) op.push(ch);//op.size()==0;
            else{
                if(ch=='+' || ch=='-'){//step 3rd fot + & -
                    //work(kam niptao)
                    int v2=val.pop();
                    int v1=val.pop();
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);
                    op.pop();
                    op.push(ch);
                }
                if(ch=='*' || ch=='/'){//step 3rd for *&/
                    if(op.peek()=='*' || op.peek()=='/'){
                    //work(kam niptao)
                    int v2=val.pop();
                    int v1=val.pop();
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);
                    op.pop();
                    op.push(ch);
                } 
                else op.push(ch);
              }
          }
        }
        //value vale stack ko khali karo
        while(val.size()>1){
            int v2=val.pop();
            int v1=val.pop();
                if(op.peek()=='-') val.push(v1-v2);
                if(op.peek()=='+') val.push(v1+v2);
                if(op.peek()=='*') val.push(v1*v2);
                if(op.peek()=='/') val.push(v1/v2);
                    op.pop();
        } 
        System.out.println("Answer is:"+val.peek()); 
    }
}