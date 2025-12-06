
// import java.util.*;
// public class TowerOfHanoi {
//     // Move n disks from 'from' to 'to' using 'aux' as auxiliary peg
//     static int hanoi(int n, char from, char to, char aux) {//step=2^n-1
//         if (n <= 0) return 0;
//         if (n == 1) {
//             System.out.println("Move disk 1 from " + from + " to " + to);
//             return 1;                            
//         }
//         int step1=hanoi(n - 1, from, aux, to);
//         System.out.println("Move disk " + n + " from " + from + " to " + to);
//         int step2=hanoi(n - 1, aux, to, from);    
//         return step1+1+step2;          
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter disk:");
//         int n = sc.nextInt();                                
//         System.out.println("Tower of Hanoi with " + n + " disks:"); 
//        int totalstep=hanoi(n, 'A', 'C', 'B');  
//        System.out.print("Total step is:"+totalstep);              
//     }
// }

//gfg
class TowerOfHanoi{
    static int count;
    public int towerOfHanoi(int n, int from, int to, int aux) {
       count=0;
       hanoi(n,'A','B','C');
       //return (int)(Math.pow(2,n))-1;
       return count;
    }
    private static void hanoi(int n,char a,char b,char c){
        if(n==0) return;
        hanoi(n-1,a,c,b);
        count++;
        hanoi(n-1,b,a,c);
    }
}
