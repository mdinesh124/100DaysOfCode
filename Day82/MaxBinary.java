import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int key;
    Node left;
    Node right;
    Node (int x)
    {
        key = x;
        left = right = null;
    }

}
public class MaxBinary{
    static int max(Node root)
    {
        if(root == null) return Integer.MIN_VALUE;
        else
        {
            return Math.max(root.key,Math.max(max(root.left),max(root.right)));
        }
        
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.right = new Node(6);
        root.right.left = new Node(2);
        root.right.right = new Node(4);
        root.right.right.left = new Node(3);
        System.out.println(max(root));
    }
}
