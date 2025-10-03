
import java.util.*;
public class Divi{
    public static void divisior(int n,int i){
        if(i>n) return;
        if(n%i==0){
            System.out.print(i+" ");
        }
        divisior(n,i+1);//recursive call
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        int n=sc.nextInt();

        // for(int i=1;i<=n;i++){//iterative
        //     if(n%i==0){
        //         System.out.print(i+" ");
        //     }
        // }
        divisior(n,1);
    }
}