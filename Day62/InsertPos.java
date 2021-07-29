class Node {
    int data;
    Node next;
    Node (int x)
    {
        data = x;
        next = null;
    }
}
public class InsertPos {
    static Node insertPos(Node head,int pos,int x){
        Node temp = new Node(x);
        if(pos == 1)
        {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for(int i = 1;i<pos-2 && curr!=null;i++)
        {
             curr = curr.next;
        }
        if(curr == null)
        {
            return head;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;


    }
    public static void main(String[] args) {
        Node head = null;
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        print(head);
        System.out.println();
        head = insertPos(head,2,5);
        print(head);
        
    }
    public static void print(Node head)
    {
        Node curr = head;
        while(curr != null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
