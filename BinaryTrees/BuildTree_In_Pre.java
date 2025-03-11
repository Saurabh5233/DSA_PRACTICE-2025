

public class BuildTree_In_Pre {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // root.left.right.left = new TreeNode(10);
        root.right = new Node(3);
        // root.right.left = new TreeNode(4);
        // root.right.left.right = new TreeNode(14);
        root.right.right = new Node(7);
        
        

        Solution sol = new Solution();
        // sol.connect(root);

        System.out.println(sol.connect(root));
    }

}

class Node{
    int val;
    Node left;
    Node right;
    Node next;
    public Node(int val){
        this.val = val;
    }
}


class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder){
        
    }
}