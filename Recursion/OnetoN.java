
//1st method (2 parameter)
// import java.util.*;
// public class OnetoN{
//     public static void print(int x,int n){
//         if(x>n) return;
//         System.out.println(x);
//         print(x+1,n);
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter val:");
//         int n=sc.nextInt(); 
//        print(1,n);
//     }
// }



//2nd method (1 parameter) 
import java.util.*;
public class OnetoN{
    public static void print(int n){
        if(n==0) return;
        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter val:");
        int n=sc.nextInt(); 
       print(n);
    }
}
