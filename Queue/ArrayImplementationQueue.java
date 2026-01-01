
import java.util.*;
public class ArrayImplementationQueue{

       static class queueA{
        int f=-1;
        int r=-1;
        int size=0;
        int[] arr=new int[100];

         public void add(int val){
            if(r==arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            if(f==-1){
                f=r=0;
                arr[0]=val;
            }else{
                arr[++r]=val;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is full");
                return -1;
            }else{
            f++;
            }
            size--;
            return arr[f-1];
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is full");
                return -1;
            }
            return arr[f];
        }
        public boolean isEmpty(){
            if(size==0){
                System.out.println("Queue is full");
                return true;
            }else{
                return false;
            }
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is full");
            }
            else{
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        queueA q=new queueA();//ArrayList
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            q.add(val);
        }
        q.display();
        q.remove();
        q.display();
    }
}