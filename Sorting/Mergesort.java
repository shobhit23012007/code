
import java.util.*;
public class Mergesort{
    static void merge(int[] arr,int st,int mid,int end){
        int[] temp= new int[end - st + 1];
        int i=st;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i];
                i++;
            }else{
                temp[k++]=arr[j];
                j++;
            }
        }
        while(i<=mid){//left half ke liye
            temp[k++]=arr[i];
            i++;
        }
        while(j<=end){//right half ke liye
            temp[k++]=arr[j];
            j++;
        }

        for(int idx=0;idx<temp.length;idx++){
            arr[idx+st]=temp[idx];
        }
        
    }
    static void mergesort(int[] arr,int st,int end){
        if(st<end){
            int mid=st+(end-st)/2;
            mergesort(arr,st,mid);//left half
            mergesort(arr,mid+1,end);//right half
            
            merge(arr,st,mid,end);
        }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		mergesort(arr,0,arr.length-1);
		
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
		
	}
}
 