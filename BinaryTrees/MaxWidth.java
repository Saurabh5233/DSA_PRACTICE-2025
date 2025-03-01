public class MaxWidth {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        
        

        Solution sol = new Solution();
        System.out.println(sol.widthOfBinaryTree(root));
    }

}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val = val;
    }
}


class Solution{
    public int widthOfBinaryTree(TreeNode root){
        int maxWidth = 0;
        
    }
}