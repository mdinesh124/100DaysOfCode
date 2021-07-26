import java.util.*;
public class CreateLinkedList {
    static class Node {
        int data;
        Node next;
        Node (int x)
        {
            data = x;
            next = null;
        }
    }
    
    public static void main(String[] args) {
        Node head = new Node(1);
        Node temp1 = new Node(2);
        Node temp2 = new Node(3);
        Node temp3 = new Node(4);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = null;
        System.out.println(head.data+"-->"+temp1.data+"-->"+temp2.data+"-->"+temp3.data);
    }
}
