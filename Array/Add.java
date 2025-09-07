import java.util.*;
public class Add{
    static int add(int[] arr,int x){
        int a=arr.length;
        int ans=0;
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                for(int k=j+1;k<a;k++){
                if(arr[i]+arr[j]+arr[k]==x){
                ans++;
                }
                }
            }
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
		System.out.print("sum :");
		int x=sc.nextInt();
		System.out.print(add(arr,x));
	}
}
