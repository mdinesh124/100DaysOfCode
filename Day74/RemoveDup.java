class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

class RemoveDup { 


static Node removeDup(Node head){
     if (head == null) {
        return null;
    }
 
    Node curr = head;
    while (curr.next != null)
    {
        if (curr.data == curr.next.data)
        {
            Node nextNext = curr.next.next;
            curr.next = nextNext;
        }
        else {
            curr = curr.next;
        }
    }return head;
}

public static void main(String args[]) 
{ 
    
    Node head= new Node(10);
    head.next=new Node(10);
    head.next.next= new Node(20);
    print(head);
    System.out.println();
    head = removeDup(head);
    print(head);
    
} 

public static void print(Node head){
    Node curr=head;
    while(curr!=null){
    System.out.print(curr.data+" ");
    curr=curr.next;
}
}
} 
