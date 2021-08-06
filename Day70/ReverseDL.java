class Node{
    int data;
    Node next;
    Node prev;
    Node (int x)
    {
        data = x;
        next = null;
        prev = null;
    }
}
public class ReverseDL {
    static Node reverse(Node head)
    {
        Node prev = null;
        Node curr = head;
        if(head==null || head.next == null) 
        {
        return head;
        }
        while(curr!=null) {
         prev = curr.prev;
        curr.prev = curr.next;
        curr.next = prev;
        curr = curr.prev;
        }
        return prev.prev;
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        Node temp1 = new Node(1);
        Node temp2 = new Node(4);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        head = reverse(head);
        print(head);
    }
    public static void print(Node head){
        Node curr = head;
        while(curr!= null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }

    }
}
