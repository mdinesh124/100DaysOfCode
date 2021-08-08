import java.util.*;
import java.io.*;
class Stack{
    ArrayList<Integer> a = new ArrayList<>();
    void push(int x)
    {
        a.add(x);
    }
    int pop()
    {
        int r = a.get(a.size() - 1);
        a.remove(a.size() - 1);
        return r;
    }
    int peek()
    {
        return a.get(a.size() - 1);
    }
    int size()
    {
        return a.size();
    }
    boolean Empty()
    {
       return a.isEmpty();
    }
}
public class ArrayListStack {
    public static void main(String[] args) {
        Stack ob = new Stack();
        ob.push(10);
        ob.push(20);
        ob.push(40);
        System.out.println(ob.pop());
        System.out.println(ob.size());
        System.out.println(ob.peek());
    }
}
