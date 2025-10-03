
import java.util.*;
public class Print{
    public static void print(int n){
        if(n==0) return;
        // print(n-1);//normal
        // System.out.println(n);
        
        System.out.println(n);//reverse
        print(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
}