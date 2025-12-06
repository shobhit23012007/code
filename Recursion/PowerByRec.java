import java.util.Scanner;

public class PowerByRec{
    public static int pow(int a,int b){//a=base  b=exp
        if(b==0) return 1;//ex=2^0=1
        //return a*pow(a,b-1);T.C.=O(exp) or O(b) or O(n)
        int ans=pow(a,b/2);
        if(b%2==0) return ans*ans;//even par esme T.C.=O(logexp) or O(logb) or O(n)
        else return a*ans*ans;//odd par
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take base and exponent
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exp = sc.nextInt();
        System.out.println(base + "^" + exp + " = " +pow(base,exp));
    }
}
