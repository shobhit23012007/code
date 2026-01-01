import java.util.*;

public class PrefixToInfix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("the question is:");//(-9/*+5346)--(9-5+3*4/6)(prefix to infix)
        String str=sc.next();
        Stack<String> val=new Stack<>();

        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ch+"");
            }else{
                String v1=val.pop();
                String v2=val.pop();
                char op=ch;
                //v1+v2+op 
                String t="("+v1+op+v2+")";//bracket lete chalo har bar taki priority pata rahe
                val.push(t);
                
            }
        }
        System.out.println(val.peek());//(9-(((5+3)*4)/6))
    }
}