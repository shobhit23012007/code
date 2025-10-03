import java.util.*;
public class Fibbo{
    public static int fib(int n){//recursive
            if(n==0 || n==1){
                return n;
            }
            int fibN=fib(n-1)+fib(n-2);
            return fibN;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        // int a = 0, b = 1;
        // System.out.print("Fibonacci series: ");
        // for (int i = 0; i < n; i++) {//ITERATIVE
        //     System.out.print(a + " ");
        //     int temp = a + b;
        //     a = b;
        //     b = temp;
        // }

        System.out.print("Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
        