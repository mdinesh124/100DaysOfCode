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

class Ceil { 
    
    public static void main(String args[]) 
    { 
        Node root=new Node(15);
    	root.left=new Node(5);
    	root.right=new Node(20);
    	root.right.left=new Node(18);
    	int x=24;
    	
    	System.out.print(ceil(root,17).key);
    } 
    
    public static Node ceil(Node root, int x){
        Node res=null;
        while(root!=null){
            if(root.key==x)
                return root;
            else if(root.key<x)
                root=root.right;
            else{
                res=root;
                root=root.left;
            }
        }
        return res;
    } 
} 
