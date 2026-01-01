import java.util.*;
public class BracketBalance{
    public static boolean isBalance(String str){
        Stack<Character> st=new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){//st.size()==0
                return false;
                }
                if(ch==')') st.pop();
            }
        }
        if(!st.isEmpty()) {//st.size()>0
            return false;
        }
        else return true;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.print(isBalance(str));
	}
}

//count karne ke liye hai code ki kitna bracket extra hai balance hone ke liye

// import java.util.*;
// public class Main{
//     public static int isBalance(String str){
//         Stack<Character> st=new Stack<>();
//         int n=str.length();
//         int count=0;
//         for(int i=0;i<n;i++){
//             char ch=str.charAt(i);
//             if(ch=='('){
//                 st.push(ch);
//             }
//             else if(ch=='('){
//                 if(st.size()==0){ 
//                     count++;
//                 }
//                 else st.pop();
//             }
//         }
//         return count + st.size();
//     }
// 	public static void main(String[] args) {
// 	    Scanner sc=new Scanner(System.in);
// 		String str=sc.nextLine();
// 		 int ans = isBalance(str);
//         if (ans == 0) {
//             System.out.println("Balanced string, no need to remove");
//         } else {
//             System.out.println("Remove " + ans + " bracket(s) to balance");
//         }
// 	}
// }
