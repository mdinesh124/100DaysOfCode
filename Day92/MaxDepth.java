public class MaxDepth {  
    public static class Node{  
        int data;  
        Node left;  
        Node right;  
  
        public Node(int data){  
            this.data = data;  
            this.left = null;  
            this.right = null;  
        }  
    }  
    public Node root;  
    public  MaxDepth(){  
        root = null;  
    }  
    public int findHeight(Node temp){ 
        if(root == null) {  
             System.out.println("empty");  
            return 0;  
        }  
        else {  
            int leftHeight = 0, rightHeight = 0;  
  
           
            if(temp.left != null)  
                leftHeight = findHeight(temp.left);  
  
            
            if(temp.right != null)  
                rightHeight = findHeight(temp.right);  
            int max = (leftHeight > rightHeight) ? leftHeight : rightHeight;  
            return (max + 1);  
        }  
     }  
  
    public static void main(String[] args) {  
  
        MaxDepth bt = new MaxDepth();  
        bt.root = new Node(1);  
        bt.root.left = new Node(2);  
        bt.root.right = new Node(3);  
        bt.root.left.left = new Node(4);  
        System.out.println(bt.findHeight(bt.root));  
  }  
}  