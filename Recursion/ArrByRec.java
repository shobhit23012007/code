
import java.util.*;

//sida printing
// public class ArrByRec{
//     public static void printArrayByRec(int[] arr,int idx){
//         if(idx==arr.length) return;
//         System.out.print(arr[idx]+" ");
//         printArrayByRec(arr, idx+1);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter size of array:");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         printArrayByRec(arr, 0);
//     }
// }


//reverse printing
// public class ArrByRec{
//     public static void printArrayByRec(int[] arr,int idx){
//         if(idx<0) return;
//         System.out.print(arr[idx]+" ");
//         printArrayByRec(arr, idx-1);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter size of array:");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int a=arr.length;
//         printArrayByRec(arr,a-1);
//     }
// }

//reverse normal(jab recursive call pahle lag jaye print ke)(Head call)
public class ArrByRec{
    public static void printArrayByRec(int[] arr,int idx){
        if(idx==arr.length) return;
        printArrayByRec(arr, idx+1);
        System.out.print(arr[idx]+" ");
        // printArrayByRec(arr, idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printArrayByRec(arr, 0);
    }
}
