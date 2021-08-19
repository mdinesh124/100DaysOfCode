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


class IterativePreorder { 
    
    public static void main(String args[]) 
    { 
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.left.left=new Node(40);
    	root.left.right=new Node(50);
        root.left.right.right=new Node(90);
        root.left.left.left=new Node(70);
        root.left.left.right=new Node(80);
    	
    	preorder(root);
    } 
    
    public static void preorder(Node root){
        Stack<Node> s = new Stack<>();
        Node curr = root;
        while(curr != null || s.isEmpty() == false)
        {
            while(curr!=null){
                 s.push(curr);
                
            System.out.print(curr.key+" ");
            curr = curr.left;
                
            }
            curr = s.pop();
            curr = curr.right;
        }
    } 
} 
