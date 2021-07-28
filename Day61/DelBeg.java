class Node {
    int data;
    Node next;
    Node (int x)
    {
        data = x;
        next = null;
    }
}
public class DelBeg {
    static Node delBeg(Node head)
    {
        if(head == null) return null;
        else
        {
            return head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        print(head);
        System.out.println();
        head = delBeg(head);
        print(head);
    }
    public static void print(Node head)
    {
        Node curr = head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
