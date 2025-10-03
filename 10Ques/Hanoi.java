
import java.util.*;
public class Hanoi{
    public static void hanoi(int n,char st,char help,char des){
        if (n == 1) {
            System.out.println("Move disk from " + st + " to " + des);
            return;
        }
     hanoi(n-1,st,des,help);
        System.out.println("Move disk from "+st+" to "+help+" by "+des);
        hanoi(n-1,help,st,des);
    

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        hanoi(n,'A','B','C');

    }
}