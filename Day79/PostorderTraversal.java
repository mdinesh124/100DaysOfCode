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


class PostorderTraversal { 
    
    public static void main(String args[]) 
    { 
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(3);
    	root.right.left=new Node(4);
    	root.right.right=new Node(50);
    	
    	postorder(root);
    } 
    
    public static void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);    
            System.out.print(root.key+" ");
        }
    } 
} 