class Node{
    int data;
    Node next;
    Node (int x)
    {
        data = x;
        next = null;
    }
}
public class DelEnd {
    static Node delEnd(Node head)
    {
        if(head == null) return null;
        if(head.next == null) return null;
        Node curr = head;
        while(curr.next.next!=null) {
        curr = curr.next;
        }
        curr.next = null;
        return head;

    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        print(head);
        System.out.println();
        head = delEnd(head);
        print(head);
    }
    public static void print(Node head)
    {
        Node curr = head;
        while(curr!=null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
