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
public class InsertEndCL {
    static Node insertEnd(Node head,int x)
    {
        Node temp = new Node(x);
        Node curr = head;
        if(head==null)
        {
            temp.next = temp;
            return temp;
        }
        while(curr.next != head)
        {
            curr = curr.next;
          
        }
        curr.next = temp;
        temp.next = head;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = head;
       head = insertEnd(head,5);
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
