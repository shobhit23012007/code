import java.util.*;
public class Fact{
    public static int fact(int n){//recursive
            if(n==0 || n==1){
                return 1;
            }
            return n*fact(n-1);
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int fact=1;
        // for(int i=1;i<=n;i++){//iterative
        //     fact*=i;
        // }
        // System.out.println("Factorial is:"+fact);


        System.out.print("factorial is:"+fact(n));
    }
}
        