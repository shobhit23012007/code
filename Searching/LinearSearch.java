
//1D
// import java.util.*;
// public class LinearSearch{
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
//         System.out.print("take i/p for array:");
// 		int n=sc.nextInt();
// 		int[] arr=new int[n];
// 		for(int i=0;i<n;i++){
// 		    arr[i]=sc.nextInt();
// 		}
//         System.out.println("Enter the taget value:");
//         int target1=sc.nextInt();
//         System.out.println("Enter the taget value:");
//         int target2=sc.nextInt();
//         boolean flag1=false;
//         boolean flag2=false;
//         for(int i=0;i<n;i++){
//             if(arr[i]==target1){
//                 flag1=true;
//                 //System.out.println("Element 1 found at idx:"+i);
//             }
//             if(arr[i]==target2){
//                 flag2=true;
//                 //System.out.println("Element 2 found at idx:"+i);
//             }
//         }
//         System.out.println(flag1);
//         System.out.println(flag2);

//     }
// }


//2D
import java.util.*;
public class LinearSearch{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("take i/p for row array:");
		int n=sc.nextInt();
         System.out.print("take i/p for column array:");
		int m=sc.nextInt();
		int[][] arr=new int[n][m];
		for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
		    arr[i][j]=sc.nextInt();
            }
		}
        System.out.println("Enter the taget value:");
        int target1=sc.nextInt();
        boolean flag1=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            if(arr[i][j]==target1){
                flag1=true;
                System.out.println("element found at idx:"+(i+","+j));
            }
        }
     }
        System.out.println(flag1);
    }
}