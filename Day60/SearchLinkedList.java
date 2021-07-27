class Node{
    int data;
    Node next;
    Node (int x)
    {
        data = x;
        next = null;
    }
}
public class SearchLinkedList {
    
       static int search(Node head, int x)
        {
            int pos = 1;
            Node curr = head;
            while(curr != null)
            {
                if(curr.data == x)
                {
                    return pos;
                }
                else
                {
                    pos++;
                    curr=curr.next;
                }
            }
            return -1;


        }
        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            System.out.println(search(head,3));
        }
    }
    

