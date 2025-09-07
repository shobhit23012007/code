import java.util.*;
public class Swap{
    static int swaping(int a,int b){
        System.out.println("print the no.first:");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        // a=a+b;
        // b=a-b;
        // a=a-b;
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swaping");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        return 0;
    }
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int m=sc.nextInt();
        swaping(n, m);
		
		
	}
}
