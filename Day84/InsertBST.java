
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
public class InsertBST {
    public static void main(String[] args) {
        Node root=new Node(10);
    	root.left=new Node(5);
    	root.right=new Node(15);
        root.right.left=new Node(12);
    	root.right.right=new Node(18);
    	
        int x=20;
    	
    	root=InsertBST(root,x);
	    inorder(root);
    }
    public static Node InsertBST(Node root,int x){
        if(root==null){
            return new Node(x);
        }
        else if(root.key>x)
        {
            root.left = InsertBST(root.left,x);
        }
        else if(root.key<x)
        {
            root.right = InsertBST(root.right,x);
        }
        
            return root;
        
    } 
    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }    
    }
}
