import java.util.*;

public class EvaluationOfPrefix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("the question is:");//9+(5+3)*4/6---(-9/*+5346)(infix to prefix)
        String str=sc.next();
        Stack<Integer> val=new Stack<>();

        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
            }else{
                int v2=val.pop();
                int v1=val.pop();
                if(ch=='+') val.push(v2+v1);
                if(ch=='-') val.push(v2-v1);
                if(ch=='*') val.push(v2*v1);
                if(ch=='/') val.push(v2/v1);
            }
        }
        System.out.println(val.peek());//4
    }
}