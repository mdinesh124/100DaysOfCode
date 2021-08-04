class Node
{
    int data;
    Node next;
    Node(int x)
    {
        data = x;
        next = null;
    }

}
public class DeleteheadCL {
    static Node deleteHead(Node head)
    {
        if(head==null)
        {
            return null;
        }
        if(head.next==head)
        {
            return null;
        }
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = head;
       head = deleteHead(head);
       print(head);    
    
    
    }
    public static void print(Node head)
    {
        if(head==null)return;
        Node curr=head;
        do{
            System.out.print(curr.data+" ");
            curr=curr.next;
        }while(curr!=head);
    }
}
