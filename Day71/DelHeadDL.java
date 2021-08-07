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
public class DelHeadDL {
    static Node delHead(Node head)
    {
        if(head == null) return null;
        if(head.next == null) return null;
        else{
        head = head.next;
        head.prev = null;
        return head;
        }

    }
    public static void main(String[] args) {
        Node head = new Node(43);
        Node temp1 = new Node(53);
        Node temp2 = new Node(3);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        head = delHead(head);
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
