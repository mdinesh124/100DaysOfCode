class Node {
    int data;
    Node next;
    Node (int x)
    {
        data = x;
        next = null;
    }
}
public class SortedInsert {
    static Node sortedInsert(Node head,int x)
    {
        Node temp = new Node(4);
        if(head == null)
        {
            return temp;
        }
        if(x<head.data)
        {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        while(curr.next!=null && curr.next.data<x)
        {
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;return head;
    }
    public static void main(String[] args) {
        Node head = null;
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        print(head);
        System.out.println();
        head = sortedInsert(head,2);
        print(head);
    }
    public static void print(Node head)
    {
        Node curr = head;
        while(curr != null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
