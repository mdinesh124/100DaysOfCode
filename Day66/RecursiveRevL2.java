class Node{
    int data;
    Node next;
    Node (int x)
    {
        data = x;
        next = null;
    }
}
public class RecursiveRevL2 {
    static Node recurse(Node head)
    {
        if(head==null||head.next==null)return head;
        Node rev_head=recurse(head.next);
        Node tail=head.next;
        tail.next=head;
        head.next=null;
        return rev_head;
    }
    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(8);
        head.next.next = new Node(12);
        print(head);
        System.out.println();
        head = recurse(head);
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
