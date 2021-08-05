class Node
{
    int data;
    Node next;
    Node prev;
    Node(int x)
    {
        data = x;
        next = null;
        prev = null;
    }

}
public class InsertBegDL {
    static Node insert(Node head,int x)
    {
        Node temp = new Node(x);
        temp.next = head;
        if(head!=null)
        {
            head.prev = temp;
        }
        return temp;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
    Node t1 = new Node(2);
    Node t2 = new Node(3);
    head.next = t1;
    t1.prev = head;
    t1.next = t2;
    t2.prev = t1;
    head = insert(head,4);
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
