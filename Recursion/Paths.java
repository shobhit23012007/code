
import java.util.Scanner;


//method 1st
// public class Paths{
//     public static int uniquepaths(int m,int n){
//         if(m==1 || n==1){
//             return 1;
//         }
//         return uniquepaths(m, n-1)+uniquepaths(m-1, n);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter row:");
//         int row=sc.nextInt();
//         System.out.print("Enter column:");
//         int column=sc.nextInt();
//         System.out.println("unique path is:"+uniquepaths(row, column));
//     }
// }


//2nd method
// public class Paths{
//     public static  int path(int cr,int cc,int lr,int lc){
//         if(cr==lr && cc==lc) return 1;
//         if(cr>lr || cc>lc) return 0;
//         int right=path(cr,cc+1,lr,lc);
//         int down=path(cr+1,cc,lr,lc);
//         return right+down;
//     }
//     public static int uniquepaths(int m,int n){
//         return path(0,0,m-1,n-1);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter row:");
//         int row=sc.nextInt();
//         System.out.print("Enter column:");
//         int column=sc.nextInt();
//         System.out.println("unique path is:"+uniquepaths(row, column));
//     }
// }


//3rd method ulta chalo (m,n) to (1,1)
//(ulta karne se 2 extra variabe use nhi honge)
// public class Paths{
//     public static  int path(int cr,int cc){
//         if(cr==1 && cc==1) return 1;
//         if(cr==0 || cc==0) return 0;
//         int right=path(cr,cc-1);
//         int down=path(cr-1,cc);
//         return right+down;
//     }
//     public static int uniquepaths(int m,int n){
//         return path(m,n);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter row:");
//         int row=sc.nextInt();
//         System.out.print("Enter column:");
//         int column=sc.nextInt();
//         System.out.println("unique path is:"+uniquepaths(row, column));
//     }
// }

//4th method (ab helper function nhi banana padega)
public class Paths{
    public static int uniquepaths(int m,int n){
        if(m==1 && n==1) return 1;
        if(m==0 || n==0) return 0;//ye base case optional hai
        // int right=uniquepaths(m,n-1);
        // int down=uniquepaths(m-1,n);
        // return right+down;
        return uniquepaths(m,n-1)+uniquepaths(m-1,n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row:");
        int row=sc.nextInt();
        System.out.print("Enter column:");
        int column=sc.nextInt();
        System.out.println("unique path is:"+uniquepaths(row, column));
    }
}