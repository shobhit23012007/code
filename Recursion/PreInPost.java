import java.util.*;
public class PreInPost{
    public static void pip(int n){
        if(n==0) return;
        System.out.print("pre "+n+" ");//pre
        pip(n-1);
        System.out.print("In "+n+" ");//in
        pip(n-1);
        System.out.print("post "+n+" ");//post
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no:");
        int n=sc.nextInt();
        pip(n);
    }
}