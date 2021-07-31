class Node{
    int data;
    Node next;
    Node (int x)
    {
        data = x;
        next = null;
    }
}
public class ReverseLS {
    static Node reverse(Node head)
    {
        
        Node curr = head;
        Node prev = null;
        while(curr!=null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        return prev;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        print(head);
        System.out.println();
       head = reverse(head);
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
