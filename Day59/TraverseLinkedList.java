public class TraverseLinkedList {
    static class Node{
        int data;
        Node next;
        Node (int x)
        {
            data = x;
            next = null;
        }
    }
        public static void main(String[] args) {

            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
           print(head);
        }
        public static void print(Node head)
        {
            Node curr = head;
            while(curr!=null) {
                System.out.println(curr.data+" ");
                curr = curr.next;
            }
        }
    }

