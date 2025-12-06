import java.util.*;

public class PowerLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take base and exponent
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exp = sc.nextInt();
        //1st method
        // int ans = 1;
        // for (int i = 1; i <= exp; i++) {// loop runs 'exp' times
        //     ans *= base;
        // }
        // System.out.println(base + "^" + exp + " = " + ans);

        //2nd method
        System.out.println(base + "^" + exp + " = " +Math.pow(base,exp));
    }
}
