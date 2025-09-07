import java.util.*;
public class Repeat{
    static int repeatN(int[] arr){
        int a=arr.length;
        for(int i=0;i<a;i++){
            for (int j=i+1; j<a; j++) {
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return 0;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.print("first repeating no:"+repeatN(arr));
	}
}
