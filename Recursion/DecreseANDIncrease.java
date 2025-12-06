// import java.util.*;
// public class DecreseANDIncrease{//o/p=4 3 2 1 1 2 3 4
//     public static void print(int n){
//         if(n==0) return;
//         System.out.print(n+" ");
//         print(n-1);
//         System.out.print(n+" ");
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter val:");
//         int n=sc.nextInt(); 
//        print(n);
//     }
// }


//1 ki repetation ko hatane par
import java.util.*;
public class DecreseANDIncrease{//o/p=4 3 2 1 2 3 4
    public static void print(int n){
        if(n==0) return;
        System.out.print(n+" ");
        print(n-1);
        if(n!=1) System.out.print(n+" ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter val:");
        int n=sc.nextInt(); 
       print(n);
    }
}
