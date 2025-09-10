import java.util.ArrayList;
import java.util.Collections;
public class QuesByCollection{
    static void reverseList(ArrayList<Integer> l1){
        int i=0,j=l1.size()-1;
        while(i<j){
            Integer temp=l1.get(i);
            //Integer temp=Integer.valueOf(l1.get(i));
            l1.set(i, l1.get(j));
            l1.set(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(0);
        l1.add(10);
        l1.add(3);
        l1.add(5);
        l1.add(22);
        l1.add(10);
        System.out.println("Original list:"+l1);
        
        reverseList(l1);
        System.out.println("reversed list:"+l1);

        Collections.sort(l1);
        System.out.println("Accending order:"+l1);

        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("Decendig order:"+l1);

        ArrayList<String> l2=new ArrayList<>();
        // l2.add("Welcome");
        // l2.add("Physics");

        l2.add("Apple");
        l2.add("Banana");
        System.out.println("OG:"+l2);
        Collections.sort(l2);
        System.out.println("Sorted:"+l2);


    }
}