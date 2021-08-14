import java.util.*;
import java.io.*;
class MinMax{
    Deque<Integer> dq;
    MinMax() {
        dq = new LinkedList<Integer>();
    }
        void insertMax(int x)
        {
            dq.offerFirst(x);

        }
        void insertMin(int x)
        {
            dq.offerLast(x);

        }
        int getMax()
        {
            return dq.peekLast();
        }
        int getMin()
        {
            return dq.peekFirst();
        }
        int removeMin()
        {
            return dq.pollFirst();

        }
        int removeMax()
        {
          return dq.pollLast();

        }

    
}
public class MinMaxOp {
    public static void main(String[] args) {
       MinMax d = new MinMax();
        d.insertMin(10);
        d.insertMin(20);
        d.insertMax(30);
        d.insertMax(40);
        d.insertMin(3);
        d.insertMax(5);
        System.out.println(d.getMin());
        System.out.println(d.getMax());
        int x= d.removeMin();
		System.out.println(x);
		
		x= d.removeMax();
		System.out.println(x);
        
    }
}
