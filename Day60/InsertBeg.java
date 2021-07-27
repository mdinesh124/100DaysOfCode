class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }
  
class InsertBeg { 
    
    
    static Node insertBegin(Node head, int x){
        Node temp=new Node(x);
        temp.next=head;
        return temp;
    }
    
    public static void main(String args[]) 
    { 
        Node head=null;
	    head=insertBegin(head,30);
	    head=insertBegin(head,20);
	    head=insertBegin(head,10);
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
