
import java.util.ArrayList;

public class Normal{
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(5);
        l1.add(4);
        //System.out.println(l1);
        //System.out.println(l1[0]); //(Error dega kyuki array ka ye([0]) approch hai.)
        //System.out.println(l1.get(0));
        //for(int i=0;i<l1.length;i++) //ye bhi array ka aproch hai.
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));//5,4
        }
        System.out.println(l1);//ye chiz se hum direct print kara sakte hai esme hume loop nhi lagana padega.

        //adding element at index
        l1.add(1,10);
        System.out.println(l1);// 5,10,4

        //SET ELEMENT at specific idx
        l1.set(1,13);
        System.out.println(l1);//5,13,4

        //removing element at index i
        l1.remove(1);
        System.out.println(l1);//5,4

        //removing an element e
        l1.remove(Integer.valueOf(4));
        System.out.println(l1);//5

        //System.out.println(l1.remove(Integer.valueOf(5)));


        //checking if an element exists
        //boolean ans=l1.contains(Integer.valueOf(6));
        boolean ans=l1.contains(6);
        System.out.println(ans);

        ArrayList l=new ArrayList();
        l.add("abc");
        l.add(1,2);
        System.out.println(l);



    }
}