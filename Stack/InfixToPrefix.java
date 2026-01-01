
import java.util.*;

public class InfixToPrefix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("the question is:");//9-(5+3)*4/6
        String infix=sc.next();
        Stack<String> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        for(int i=0;i<infix.length();i++){
            char ch=infix.charAt(i);   
            int ascii=(int)ch;
            //step 1st;
            if(ascii>=48 && ascii<=57){
            String s=""+ch; 
            val.push(s); 
            }

            //step 2nd;
            else if(op.size()==0 || ch=='(' || op.peek()=='(') op.push(ch);//op.size()==0;
            //yaha par ek aur else if lagega closing bracket ke liye
            else if(ch==')'){
                while(op.peek()!='('){
                //work(kam niptao)
                    String v2=val.pop();
                    String v1=val.pop();
                    char o=op.pop();
                    String t=o+v1+v2;
                    val.push(t);
                }
                op.pop();//'(' hatane ke liye           
                }
            else{
                if(ch=='+' || ch=='-'){//step 3rd fot + & -
                    //work(kam niptao)
                    String v2=val.pop();
                    String v1=val.pop();
                    char o=op.pop();
                    String t=o+v1+v2;
                    val.push(t);
                    op.push(ch);
                }
                if(ch=='*' || ch=='/'){//step 3rd for *&/
                    if(op.peek()=='*' || op.peek()=='/'){
                    String v2=val.pop();
                    String v1=val.pop();
                    char o=op.pop();
                    String t=o+v1+v2;
                    val.push(t);
                    op.push(ch);
                } 
                else op.push(ch);
              }
          }
        }
        //value vale stack ko khali karo
        while(val.size()>1){
                    String v2=val.pop();
                    String v1=val.pop();
                    char o=op.pop();
                    String t=o+v1+v2;
                    val.push(t);
        } 
        String prefix=val.pop();
        System.out.println("Answer is:"+prefix); //+-95/*346
    }
}