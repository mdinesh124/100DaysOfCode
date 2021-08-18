import java.util.*;
import java.io.*;

class Node  
{ 
  int key; 
  Node left; 
  Node right; 
  Node(int k){
      key=k;
      left=right=null;
  }
}


class IterativeInorder { 
    
    public static void main(String args[]) 
    { 
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(3);
    	root.right.left=new Node(4);
    	root.right.right=new Node(50);
    	
    	Iterinorder(root);
    } 
    
    public static void Iterinorder(Node root){
        Stack<Node> s = new Stack<>();
        Node curr = root;
        while(curr != null || s.isEmpty() == false)
        {
            while(curr!=null){
                 s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            System.out.print(curr.key+" ");
            curr = curr.right;
        }
    } 
} 