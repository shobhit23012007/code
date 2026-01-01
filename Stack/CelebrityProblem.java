import java.util.*;
public class CelebrityProblem{
    public static int celebrity(int M[][],int n){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            st.push(i);
        }
        while(st.size()>1){
            int v1=st.pop();
            int v2=st.pop();
            if(M[v1][v2]==0){
                st.push(v1);
            }else if(M[v2][v1]==0) st.push(v2);
        }
        if(st.size()==0) return -1;
        int potential=st.pop();
        for(int j=0;j<n;j++){
            if(M[potential][j]==1) return -1;
        }
        for(int i=0;i<n;i++){
            if(i==potential) continue;
            if(M[i][potential]==0) return -1;
        }
        return potential;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of row and column:");
		int n=sc.nextInt();
		System.out.println("Enter the matrix:");
		int[][] M=new int[n][n];
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        M[i][j]=sc.nextInt();
		    }
		}
		int result=celebrity(M,n);
		System.out.print("celebrity is:"+result);
	}
}
