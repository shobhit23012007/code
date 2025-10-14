

//1D
// import java.util.*;
// public class BinarySearch{
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the no. of element:");
// 		int n=sc.nextInt();
//         System.out.print("Enter the array:");
// 		int[] arr=new int[n];
// 		for(int i=0;i<n;i++){
// 		    arr[i]=sc.nextInt(); 
// 		}
// 		int r=n-1;
// 		int l=0;
// 		boolean found=false;
// 		int mid;
//         System.out.print("Enter the key:");
// 		int key=sc.nextInt();
// 		while(l<=r){
// 		    mid=l+(r-l)/2;
// 		    if(arr[mid]==key){
// 		        System.out.print("Element found At:"+ mid);
// 		        found=true;
// 		        break;
// 		    }else if(arr[mid]<key){
// 		        l=mid+1;
// 		    }else{
// 		        r=mid-1;
// 		    }
// 		 }
// 		 if(!found){
// 		     System.out.print("Element not found");
// 		 }
// 	}
// }



//2D
import java.util.*;
public class BinarySearch{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row:");
		int m=sc.nextInt();
		System.out.print("Enter column:");
		int n=sc.nextInt();
		int[][] arr=new int[m][n];
		for(int i=0;i<m;i++){
		    for(int j=0;j<m;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		System.out.print("Enter the target element:");
		int target=sc.nextInt();
		int i=0;
		int j=n-1;
		boolean flag=false;
		while(i<m && j>=0){
		        if(arr[i][j]==target){
		            flag=true;
		            System.out.print("element found at idx:"+i+","+j);
		            break;
		        }else if(arr[i][j]<target){
		            i++;
		        }else{
		           j--;
		        }
		   }
		   if(!flag){
            System.out.println("Element not found");
        }
	}
}

