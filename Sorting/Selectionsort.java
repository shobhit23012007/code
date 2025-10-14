import java.util.*;
public class Selectionsort{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}

		for(int i=0;i<n;i++){
            int si=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[si]){
                    si=j;
                }
            }
            int temp=arr[si];
            arr[si]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<n;i++){
		        System.out.print(arr[i]+" ");
		    }
	}
}
