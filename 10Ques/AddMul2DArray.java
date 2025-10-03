// import java.util.*;
// public class AddMul2DArray{
//         public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter row 1st array size:");
//         int m=sc.nextInt();
//         System.out.println("Enter column 1st array size:");
//         int n=sc.nextInt();
//         System.out.println("Enter row 2nd array size:");
//         int p=sc.nextInt();
//         System.out.println("Enter column 2nd array size:");
//         int q=sc.nextInt();
//         int[][] arr=new int[m][n];
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//             arr[i][j]=sc.nextInt();
//          }
//         }
//         System.out.println("1st array:");
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//             System.out.print(arr[i][j]+" ");
//            }
//              System.out.println();
//         }
//         System.out.println();
//         int[][] brr=new int[p][q];
//         for(int i=0;i<p;i++){
//             for(int j=0;j<q;j++){
//             brr[i][j]=sc.nextInt();
//          }
//         }
//         System.out.println();
//         System.out.println("2nd array:");
//         for(int i=0;i<p;i++){
//             for(int j=0;j<q;j++){
//             System.out.print(brr[i][j]+" ");
//            }
//              System.out.println();
//         }
//         int[][] ans=new int[m][n];
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 ans[i][j]+=arr[i][j]+brr[i][j];
//             }
//         }
//         System.out.println();
//         System.out.println("final array:");
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//             System.out.print(ans[i][j]+" ");
//            }
//         }

//     }
// }

import java.util.*;
public class AddMul2DArray{
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row 1st array size:");
        int m=sc.nextInt();
        System.out.println("Enter column 1st array size:");
        int n=sc.nextInt();
        System.out.println("Enter row 2nd array size:");
        int p=sc.nextInt();
        System.out.println("Enter column 2nd array size:");
        int q=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
            arr[i][j]=sc.nextInt();
         }
        }
        System.out.println("1st array:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
            System.out.print(arr[i][j]+" ");
           }
           System.out.println();
        }
        System.out.println();
        int[][] brr=new int[p][q];
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
            brr[i][j]=sc.nextInt();
         }
        }
        System.out.println();
        System.out.println("2nd array:");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
            System.out.print(brr[i][j]+" ");
           }
           System.out.println();
        }
        int[][] ans=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<q;j++){
                ans[i][j]=0;
                for(int k=0;k<n;k++){
                ans[i][j]+=arr[i][k]*brr[k][j];
                }
            }
        }
        System.out.println();
        System.out.println("final array:");
        for(int i=0;i<m;i++){
            for(int j=0;j<q;j++){
            System.out.print(ans[i][j]+" ");
           }
           System.out.println();
        }

    }
}