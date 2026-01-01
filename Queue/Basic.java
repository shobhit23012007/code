
import java.util.*;

public class Basic{
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();//ArrayList
        q.add(1);//push->add
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        q.remove();//pop->remove or poll
        System.out.println(q);
        System.out.println(q.peek());//peek==element
        System.out.println(q.element());
    }
}