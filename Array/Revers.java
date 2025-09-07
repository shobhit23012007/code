// import java.util.*;
// public class Revers{
//     static int revers(int[] arr){
//         int a=arr.length;
//         for(int i=a-1;i>=0;i--){
//             System.out.print(arr[i]+" ");
//         }
//         return 0;
//     }
// public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
// 		int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//        revers(arr);
// 	}
// }


import java.util.*;
public class Revers{
    static void swapInArray(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void revers(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       revers(arr);
         for(int num : arr){
            System.out.print(num + " ");
         }
	}
}
