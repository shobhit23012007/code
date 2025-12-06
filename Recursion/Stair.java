
import java.util.*;


//1st method T.C.=O(2^n)
// public class Stair{
//     public static int jump(int n){
//         if(n==1 || n==2) return n;
//         return jump(n-1)+jump(n-2);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the stair no:");
//         int n=sc.nextInt();
//         System.out.println("Total ways to reach the destination is:"+countWays(n));
//     }
// }



//2nd method T.C.=O(n)
public class Stair{
    static int countWays(int n) {
        if(n == 1) return 1;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the stair no:");
        int n=sc.nextInt();
        System.out.println("Total ways to reach the destination is:"+countWays(n));
    }
}

