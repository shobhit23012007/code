public class StackbyArray{
    public static class Stack{
        int[] arr=new int[10];
        private int idx=0;
        void push(int x){
            if(isFull()){
                System.out.print("stack is full");
                return;
            }
            arr[idx]=x;
            idx++;
        }
        int peek(){
            if(idx==0){
                System.out.print("stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.print("stack is empty");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(size()==0){
                return true;
            }
            return false;
        }
        boolean isFull(){
            if(idx==arr.length){
                return true;
            }
            return false;
        }
    }
	public static void main(String[] args) {
	    	Stack st=new Stack();
	    	st.push(1);
	    	st.display();
	    	st.push(2);
	    	st.display();
	    	st.push(3);
	    	System.out.println(st.size());
	    	st.display();
	    	st.push(4);
	    	st.display();
	    	System.out.print(st);
	    	System.out.print(st.size());
	    	// st.pop();
	    	// System.out.print(st);
	}
}
