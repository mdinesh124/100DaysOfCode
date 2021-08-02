class Node{
    int data;
    Node next;
    Node (int x)
    {
        data = x;
        next = null;
    }
}
public class RecursiveRevL {
    static Node recurse(Node curr, Node prev)
    {
        if(curr == null) return prev;
        Node next = curr.next;
        curr.next = prev;
        return recurse(next,curr);
    }
    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(8);
        head.next.next = new Node(12);
        print(head);
        System.out.println();
        head = recurse(head,null);
        print(head);
    }
    public static void print(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
