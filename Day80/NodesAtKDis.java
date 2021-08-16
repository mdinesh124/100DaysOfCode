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
public class NodesAtKDis {
    static void NodeKDis(Node root, int k)
    {
        if(root == null) return;
        if(k == 0) {
         System.out.println(root.key+" ");
        }
        else
        {
            NodeKDis(root.left,k-1);
            NodeKDis(root.right,k-1);
        }

    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(70);
        NodeKDis(root,2);
    }
    
}
