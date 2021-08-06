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

public class InsertEndDL{
    static Node insertEnd(Node head,int x)
    {
        Node temp = new Node(x);
        while(head==null) 
        return temp;
        Node curr = head;
        while(curr.next!=null) {
        curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        Node temp1 = new Node(1);
        Node temp2 = new Node(4);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        head = insertEnd(head,5);
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