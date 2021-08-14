import java.util.*;
import java.io.*;
public class DequeCol {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<Integer>();
        dq.offerFirst(10);
        dq.offerFirst(20);
        dq.offerLast(30);
        dq.offerLast(40);
        dq.offerFirst(3);
        dq.offerLast(5);
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        dq.pollFirst();
        dq.pollLast();
        System.out.println(dq);

    }
}


                     //OR

/*import java.util.*;
import java.io.*;
public class DequeCol {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<Integer>();
        dq.addFirst(10);
        dq.addFirst(20);
        dq.addLast(30);
        dq.addLast(40);
        dq.addFirst(3);
        dq.addLast(5);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);

    }
}

*/









