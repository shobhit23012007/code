import java.util.*;
public class Quicksort{
    static int partition(int[] arr,int st,int end){
        int idx=st-1;
        int pivot=arr[end];
        for(int j=st;j<end;j++){
        if(arr[j]<=pivot){
            idx++;
            int temp=arr[j];
            arr[j]=arr[idx];
            arr[idx]=temp;
        }
       }
     idx++;
     int temp=arr[end];
     arr[end]=arr[idx];
     arr[idx]=temp;
     return idx;
    }
    
    static void quicksort(int[] arr,int st,int end){
        if(st<end){
            int pivIdx=partition(arr,st,end);
            quicksort(arr,st,pivIdx-1);
		    quicksort(arr,pivIdx+1,end);
        }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		quicksort(arr,0,arr.length-1);
		
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
