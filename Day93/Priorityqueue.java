
import java.util.*;

class Priorityqueue{
    public static void main(String args[])
    {
    
        PriorityQueue<Integer> pq 
        = new PriorityQueue<Integer>(
            Collections.reverseOrder());

    
        pq.add(10);
        pq.add(20);
        pq.add(15);
        
        
        System.out.println(pq.peek());

        System.out.println(pq.poll());
        System.out.println(pq.peek());
    }
}
