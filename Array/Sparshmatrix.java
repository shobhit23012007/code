
import java.util.Scanner;

public class Sparshmatrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row:");
        int r=sc.nextInt();
        System.out.println("Enter column:");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]!=0){
                    count++;
                }
            }
        }
            int[][] sparse=new int[count][3];
            int k=0;
             for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(arr[i][j]!=0){
                        sparse[k][0]=i;
                        sparse[k][1]=j;
                        sparse[k][2]=arr[i][j];
                        k++;
                    }
                }
            }
            System.out.println("Row Col Val");
        for (int i=0; i<count; i++) {
            System.out.println(sparse[i][0] + "   " + sparse[i][1] + "   " + sparse[i][2]);
        }
    }
}