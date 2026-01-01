import java.util.*;
public class Leetcode20{
    public static boolean isBalance(String str){
        Stack<Character> st=new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='(' ||ch=='{'||ch=='['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                return false;
                }
                if(ch==')' || ch=='}' || ch==']') st.pop();
            }
        }
        if(!st.isEmpty()) return false;
        else return true;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.print(isBalance(str));
	}
}
