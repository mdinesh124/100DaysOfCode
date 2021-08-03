class Node{
    int data;
    Node next;
    Node (int x)
    {
        data = x;
        next = null;
    }
}
public class TraverseCL {
    static void traverse(Node head)
    {
        if(head == null) return ;
        Node curr = head;
        System.out.println(curr.data);
        while(curr.next!=head){
            curr = curr.next;
            System.out.println(curr.data);
        }
        

    }
    public static void main(String[] args) {
        Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = head;
    traverse(head);
}

}
