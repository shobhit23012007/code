import java.util.*;
class Compute{
    public int[] printFirstNegativeInteger(int[] arr,int n,int k){
        int[] res=new int[n-k+1];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                q.add(i);//idx add karo
            }
        }
        for(int i=0;i<n-k+1;i++){
            if(q.size()>0 && q.peek()<i){//!q.isEmpty()
                q.remove();
            }
            if(q.size()>0 && q.peek()<=i+k-1){//!q.isEmpty()
                res[i]=arr[q.peek()];
            }else if(q.size()==0){ res[i]=0;//q.isEmpty()
            }else res[i]=0;
        }
        return res;
    }
}
public class GFGwindowNegative{
    public static void main(String[] args){
        Compute obj=new Compute();
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int n = arr.length;
        int k = 3;
        int[] ans = obj.printFirstNegativeInteger(arr, n, k);
        System.out.println(Arrays.toString(ans));
    }
}