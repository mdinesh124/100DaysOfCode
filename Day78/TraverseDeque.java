import java.util.*;
import java.io.*;
public class TraverseDeque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<Integer>();
        dq.offerFirst(10);
        dq.offerFirst(20);
        dq.offerLast(30);
        dq.offerLast(40);
        dq.offerFirst(3);
        dq.offerLast(5);

        Iterator<Integer> it = dq.iterator();
        while(it.hasNext()) {
            System.out.print(it.next()+" ");
            System.out.println();
        }
    }
}
         

                             //OR


/*import java.util.*;
import java.io.*;
public class TraverseDeque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<Integer>();
        dq.offerFirst(10);
        dq.offerFirst(20);
        dq.offerLast(30);
        dq.offerLast(40);
        dq.offerFirst(3);
        dq.offerLast(5);

        for (int x : dq) {
            System.out.println(x+" ");
        }
    }
}*/