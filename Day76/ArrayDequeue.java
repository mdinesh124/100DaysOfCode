import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;
class ArrayDequeue { 
    public static void main (String[] args) {
        Queue<Integer> q = new ArrayDeque<>(); 
        
        q.offer(10); 
        q.offer(20); 
        q.offer(30); 
        System.out.println(q.size()); 
        System.out.println(q.isEmpty()); 
        System.out.println(q); 
    } 
} 