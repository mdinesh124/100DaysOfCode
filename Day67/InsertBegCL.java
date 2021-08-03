class Node{
    int data;
    Node next;
    Node (int x)
    {
        data = x;
        next = null;
    }
}
public class InsertBegCL {
    static Node insert(Node head,int x)
    {
        Node temp = new Node(x);
        if(head == null) { temp.next = temp;
            return temp;
        }
        else{
            temp.next = head.next;
            head.next = temp;
            int t = head.data;
            head.data = temp.data;
            temp.data = t;
        }
        return head;
        

    }
    public static void main(String[] args) {
        Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = head;
    head = insert(head,5);
    print(head);
}
public static void print(Node head)
{
    Node curr = head;
    do{
        System.out.println(curr.data+" ");
        curr = curr.next;
    }
    while(curr!=head);
        


    
}

}
