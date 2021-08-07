class Node{
    int data;
    Node next;
    Node prev;
    Node (int x)
    {
        data = x;
        prev= null;
        next = null;
    }
}
public class DelEndDL {
    static Node delEnd(Node head)
    {
        if(head == null) return null;
        if(head.next == null) return null;
        Node curr = head;
        while(curr.next != null)
        {
            curr = curr.next;
        }
        curr.prev.next = null;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(4);
        Node temp1 = new Node(7);
        Node temp2 = new Node(2);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        head = delEnd(head);
        print(head);
    }
    public static void print(Node head) {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
