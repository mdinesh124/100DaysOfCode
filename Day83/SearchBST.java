import java.util.*;

class Node{
    int key;
    Node left;
    Node right;
    Node (int x)
    {
        key = x;
        left = right = null;
    }
}
public class SearchBST {
    static boolean bst(Node root, int x)
    {
        while(root != null) {
            if(root.key == x)
        {
            return true;
        }
        else if(root.key < x)
        {
            root = root.right;
        }
        else
        {
            root = root.left;
        }
        }
        return false;
    }

    public static void main(String[] args) {
        Node root=new Node(15);
    	root.left=new Node(5);
    	root.right=new Node(20);
    	root.left.left=new Node(3);
        root.right.left = new Node(18);
    	root.right.right=new Node(80);
        root.right.left.left=new Node(16);
    	System.out.println(bst(root,16));
    }
}

                     //RECURSION
/*import java.util.*;

class Node{
    int key;
    Node left;
    Node right;
    Node (int x)
    {
        key = x;
        left = right = null;
    }
}
public class SearchBST {
    static boolean bst(Node root, int x)
    {
        if(root == null) {
            return false;
        }
           else if(root.key == x)
        {
            return true;
        }
        else if(root.key < x)
        {
            return bst(root.right, x);
        }
        else
        {
           return bst(root.left, x);
        }
        
    }

    public static void main(String[] args) {
        Node root=new Node(15);
    	root.left=new Node(5);
    	root.right=new Node(20);
    	root.left.left=new Node(3);
        root.right.left = new Node(18);
    	root.right.right=new Node(80);
        root.right.left.left=new Node(16);
    	System.out.println(bst(root,16));
    }
}*/

