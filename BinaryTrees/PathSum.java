public class PathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        // root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(5);
        // root.left.right.left = new TreeNode(10);
        root.right = new TreeNode(3);
        // root.right.left = new TreeNode(4);
        // root.right.left.right = new TreeNode(14);
        root.right.right = new TreeNode(4);
        
        

        Solution sol = new Solution();
        System.out.println(sol.hasPathSum(root, 9));
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

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return solve(root, targetSum);
    }

    private boolean solve(TreeNode root, int targetSum){
        if (root == null) return false;
        if(root.left == null && root.right == null) return targetSum == root.val;
        return solve(root.left, targetSum-root.val) || solve(root.right, targetSum-root.val);
    }
}