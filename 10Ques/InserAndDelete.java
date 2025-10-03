
import java.util.*;
public class InserAndDelete{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
        int idx=3;
        int val=10;
    int[] arr2=new int[n+1];
        for(int i=0;i<n;i++){
            if(i<idx){
                arr2[i]=arr[i];
            }else if(i==idx){
                arr2[i]=val;
            }else{
                arr2[i]=arr[i-1];
            }
        }
        System.out.println();
        for (int i=0;i<arr.length;i++){
            System.out.print(arr2[i]+" ");
        }
        for(int i=0;i<n;i++){
            if(i<idx){
                arr2[i]=arr[i];
            }else if(i==idx){
                arr2[i]=arr[i+1];
            }
        }
        System.out.println();
        for (int i=0;i<arr.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}