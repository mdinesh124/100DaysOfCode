class Node{
    int data;
    Node next;
    Node (int x)
    {
        data = x;
        next = null;
    }
}
public class RemoveDupLS {
    static void remove(Node head)
    {
        
        Node curr = head;
        while(curr!=null && curr.next!=null) {
            if(curr.data == curr.next.data) {
                curr.next = curr.next.next;
            }
                else{
                curr = curr.next;
                }
            

        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(20);
        print(head);
        System.out.println();
        remove(head);
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
