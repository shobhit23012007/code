import java.util.*;
public class ReverseArray{
    public static void print(int[] arr,int n){
        if(n<0) return;
        System.out.print(arr[n]+" ");
        print(arr,n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Reversed Array:");
        print(arr,n-1);
        // System.out.println("Original array:");
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // System.out.println("Reverse Array:");
        // for(int i=n-1;i>=0;i--){
        //     System.out.print(arr[i]+" ");
        // }
    }
}