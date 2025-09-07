import java.util.*;

public class Mult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st matrix row:");
        int m = sc.nextInt();

        System.out.println("Enter 1st matrix column:");
        int n = sc.nextInt();

        System.out.println("Enter 2nd matrix row:");
        int p = sc.nextInt();

        System.out.println("Enter 2nd matrix column:");
        int q = sc.nextInt();

        if (n != p) {
            System.out.println("Multiplication not possible!");
        }

        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[p][q];
        int[][] result = new int[m][q];

        System.out.println("\nFirst matrix input:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nSecond matrix input:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nFirst matrix output:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSecond matrix output:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        // Matrix multiplication logic
        System.out.println("\nMatrix multiplication result:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                result[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
