

//1st method (void ke liye)
// import java.util.*;
// public class ReverseByRecur{
//     public static void reverse(int n,int r){
//         if(n==0){
//             System.out.print(r);
//             return;
//         }
//         reverse(n/10,r*10+n%10);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the no:");
//         int n=sc.nextInt();
//         // int r=0;
//         // while(n!=0){//T.C.=O(log(10)n)
//         //     int ld=n%10;
//         //     r=r*10+ld;
//         //     n/=10;
//         // }
//         // System.out.println("reverse no is(by iterative):"+r);

//         reverse(n,0);
//     }
// }



//2nd methhod(int ke liye)
import java.util.*;
public class ReverseByRecur{
    public static int reverse(int n,int r){
        if(n==0){
            return r;
        }
       return reverse(n/10,r*10+n%10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no:");
        int n=sc.nextInt();

        System.out.println("Reverse by recursion:"+reverse(n,0));
    }
}