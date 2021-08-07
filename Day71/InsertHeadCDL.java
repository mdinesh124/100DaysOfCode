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
public class InsertHeadCDL {
    static Node insertHead(Node head,int x)
    {
        Node temp = new Node(x);
       if(head==null)
       {
           temp.next = temp;
           temp.prev = temp;
           return temp;
       }
       else
       {
           temp.prev = head.prev;
           temp.next = head;
           head.prev.next = temp;
           head.prev = temp;
           return temp;
       }
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        Node temp1 = new Node(1);
        Node temp2 = new Node(4);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        temp2.next = head;
        head.prev = temp2;
        head = insertHead(head,3);
        print(head);
    }
    public static void print(Node head){
        Node curr = head;
        System.out.print(curr.data+" ");
        curr = curr.next;
        while(curr!= head)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }

    }
}
