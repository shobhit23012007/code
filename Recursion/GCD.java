
import java.util.Scanner;
public class GCD{
    public static int gcd(int a,int b){
    //method 1(jo if aur return conditon hai bas yahi hi rahegi)
    // if(b%a==0) return a;//if(a==0) return b; kyuki b%a hi aage chal ke a banta hai aur a b banta hai 
    // return gcd(b%a,a);//copy se dekho

    return helper(Math.min(a,b),Math.max(a,b));
    }
    //method 2(helper func bana ke use gcd me call karke karo)
    public static int helper(int a,int b){
    if(b%a==0) return a;//if(a==0) return b;  
    return gcd(b%a,a);
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first no:");
        int a=sc.nextInt();
        System.out.print("Enter second no:");
        int b=sc.nextInt();
        // int hcf=1;
        // for(int i=2;i<=Math.min(a,b);i++){//HCF by iterrative
        //     if(a%i==0 && b%i==0){//T.C.=O(n)
        //         hcf=i;
        //     }
        // }
        // System.out.println("HCF is:"+hcf);

        System.out.println("HCF by Recursive:"+gcd(a,b));
    }
}