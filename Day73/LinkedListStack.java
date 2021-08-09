class Node{
    int data;
    Node next;
    Node (int x)
    {
        data = x;
        next = null;
    }
}
class Stack{
    Node head;
    int size;
    int r;
    Stack ()
    {
       size=0;
        head = null;
    }
    int size()
    {
        return size;
    }
    boolean Empty(){
        return (head==null);
    }
    void push(int x)
    {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }
    int pop()
    {
        if(head==null)
        {
            System.out.println("underflow, there is no element to delete");
        }
        else{
         r = head.data;
        head = head.next;
        size--;
        
        }
        return r;
    }
    int top()
    {
        if(head == null)
        {
            System.out.println("underflow");

        }
        return head.data;
    }
}
public class LinkedListStack {
    public static void main(String[] args) {
        Stack ob = new Stack();
        ob.push(30);
        ob.push(2);
        ob.push(34);
        System.out.println(ob.pop());
        System.out.println(ob.top());
        System.out.println(ob.Empty());
    }
}
