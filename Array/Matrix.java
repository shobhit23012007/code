import java.util.*;

public class Matrix {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][4];

        System.out.println("Enter 20 integers (5 rows  4 columns):");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

    
        System.out.println("The array is:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
        

        //ROTATE

//         int m = sc.nextInt();
//         int n = sc.nextInt();

//         int[][] arr1 = new int[m][n];
//         int[][] result = new int[n][m];

//         System.out.println("Enter elements:");
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 arr1[i][j] = sc.nextInt();
//             }
//         } 

//         System.out.println("matrix is");
//         for (int i = 0; i < m; i++) {
//     for (int j = 0; j < n; j++) {
//         System.out.print(arr1[i][j] + " "); 
//      }
//      System.out.println(); 
//     }

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 result[i][j] = arr1[j][i];
//             }
//         }

    
//         System.out.println("Transpose of the matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(result[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

