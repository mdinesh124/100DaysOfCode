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
public class DelKthNodeCL {
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
    static Node deleteKthNode(Node head, int k)
    {
        if(head==null)
        {
            return null;
        }
        if(k==1)
        {
            return deleteHead(head);
        }
        Node curr = head;
        for(int i=0;i<k-2;i++)
        {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = head;
       head = deleteKthNode(head,2);
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
