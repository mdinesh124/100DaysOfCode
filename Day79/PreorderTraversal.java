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


class PreorderTraversal { 
    
    public static void main(String args[]) 
    { 
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(3);
    	root.right.left=new Node(4);
    	root.right.right=new Node(50);
    	
    	preorder(root);
    } 
    
    public static void preorder(Node root){
        if(root!=null){
            System.out.print(root.key+" ");
            preorder(root.left);
            preorder(root.right);    
        }
    } 
} 