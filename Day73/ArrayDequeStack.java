import java.util.*;
import java.io.*;
public class ArrayDequeStack {
    public static void main(String[] args) {
    ArrayDeque<Integer> a = new ArrayDeque<>();
        a.push(30);
        a.push(2);
        a.push(34);
        System.out.println(a.pop());
        System.out.println(a.peek());
        System.out.println(a.size());
        System.out.println(a.isEmpty());
    }
}
