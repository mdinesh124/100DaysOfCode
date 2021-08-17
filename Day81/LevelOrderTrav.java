import java.util.Queue;
import java.util.*;
import java.io.*;

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
public class LevelOrderTrav{
    static void level(Node root)
    {
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.isEmpty()==false)
        {
            Node curr = q.poll();
            System.out.println(curr.key+" ");
            if(curr.left != null)
            {
                q.add(curr.left);
            }
            if(curr.right != null)
            {
                q.add(curr.right);
            }

        }
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.right = new Node(6);
        root.right.left = new Node(2);
        root.right.right = new Node(4);
        root.right.right.left = new Node(3);
        level(root);
    }
}