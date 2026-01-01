
import java.util.*;
public class CircularArrayImplementationQueue{

       static class queueA{
        int front=-1;
        int rear=-1;
        int size=0;
        int[] arr=new int[100];

         public void add(int val) throws Exception{
            if(rear==arr.length-1){
                System.out.println("Queue is full");//or throws newException("Queue is full")
                return;
            }
            // else if(size==0){
            //     front=rear=0;
            //     arr[0]=val;
            // }
            else if(rear<arr.length-1){
                arr[++rear]=val;
            } 
            else if(rear==arr.length-1){
                rear=0;
                arr[0]=val;
            }
            size++;
        }
        public int remove() throws Exception{
            if(size==0){
                System.out.println("Queue is empty");//or throws newException("Queue is empty")
                return -1;
            }
            else if(front==arr.length-1){
             int val=arr[front];
             front=0;
             return val;
            }else{
                int val=arr[front];
                front++;
            size--;
            return val;
         }
        }
        public int peek() throws Exception{
            if(size==0){
                System.out.println("Queue is full");//or throws newException("Queue is full")
            }
            return arr[front];
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
            else if(front<=rear){
                for(int i=front;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }else if(front>rear){
                for(int i=front;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception{
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