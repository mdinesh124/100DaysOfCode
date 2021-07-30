class Node{
    int data;
    Node next;
    Node (int x)
    {
        data = x;
        next = null;
    }

}
public class MiddleOfLS {
    static void middle(Node head)
    {
        if(head==null)return;
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.data);

    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        print(head);
        System.out.print("Middle element is :"+" ");
        middle(head);

    }
    public static void print(Node head)
    {
        Node curr = head;
        while(curr!=null) {
            System.out.println(curr.data+" ");
            curr = curr.next;
        }
    }
}
