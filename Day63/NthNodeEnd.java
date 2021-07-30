class Node{
    int data;
    Node next;
    Node (int x)
    {
        data = x;
        next = null;
    }

}
public class NthNodeEnd {
    static void nthnode(Node head, int n)
    {
        if(head == null) return;
        Node first = head;
        Node second = head;
        for(int i=0;i<n;i++)
        {
            if(first==null) return;
            first = first.next;
        }
        while(first !=null)
        {
            first = first.next;
            second = second.next;
        }
        System.out.println(second.data);
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        print(head);
        System.out.println("node from last is :");
        nthnode(head,5);
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
