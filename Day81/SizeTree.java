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
public class SizeTree {
    static int size(Node root) {
        if(root == null) return 0;
        else{
        return (size(root.left) + size(root.right) +1);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(80);
        root.right = new Node(70);
        root.left.left = new Node(30);
        root.left.right = new Node(40);
        System.out.println(size(root));
    }
}
