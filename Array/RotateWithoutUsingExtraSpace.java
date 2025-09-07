import java.util.*;

public class RotateWithoutUsingExtraSpace {

    // Reverses elements between indices i and j
    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // Rotates array to the right by k steps in-place
    static void rotateInplace(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle if k > n
        if (k < 0) {
            k = (k + n) % n; // Handle negative k
        }

        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read size of array
        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter rotation count k:");
        int k = sc.nextInt();

        System.out.println("Original array: " + Arrays.toString(arr));

        rotateInplace(arr, k);

        System.out.println("Array after rotation: " + Arrays.toString(arr));
    }
}
