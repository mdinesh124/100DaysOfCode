import java.util.*;
class Node{
    int key;
    Node left;
    Node right;
    Node (int x)
    {
        key = x;
        right = left = null;
    }
}
public class HeightTree{
   static int Height(Node root)
    {
        if(root == null) return 0;
        else
        {
            return Math.max(Height(root.left),Height(root.right))+1;
        }

    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        System.out.println(Height(root));

    }
    
}
