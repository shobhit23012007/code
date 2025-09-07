import java.util.*;
public class Smax{
    static int slarge(int[] arr){
        int a=arr.length;
        int max=0;
        int smax=0;
        for(int i=0;i<a;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            // else if (arr[i] > smax && arr[i] != max) {
            //     smax = arr[i]; 
                
            // }
        }
        return smax;
    }
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.print("second max value:"+slarge(arr));
	}
}
