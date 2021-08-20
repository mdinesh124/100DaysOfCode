import java.util.*;
import java.io.*;
import java.lang.*;

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


class FloorBST { 
    
    public static void main(String args[]) 
    { 
        Node root=new Node(15);
    	root.left=new Node(20);
    	root.left.left=new Node(35);
    	root.right=new Node(10);
    	root.right.left=new Node(18);
    	root.right.left.left=new Node(16);
    	root.right.right=new Node(70);
    	int x=40;
    	
    	System.out.print(floor(root,40).key);
    } 
    
    public static Node floor(Node root, int x){
        Node result=null;
        while(root!=null){
            if(root.key==x)
                return root;
            else if(root.key>x)
                root=root.left;
            else{
                result=root;
                root=root.right;
            }
        }
        return result;
    } 
} 