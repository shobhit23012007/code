import java.util.*;
public class Rotate{
    static int[] rotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        int[] ans=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       System.out.println("Enter k:");
       int k=sc.nextInt();

       System.out.println("Original arr");
       for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
       int[] ans=rotate(arr, k);
       System.out.println("Array after rotation");
       System.out.println(Arrays.toString(ans));
	}
}


 