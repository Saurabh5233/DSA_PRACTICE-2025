public class CountCompleteBTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        // root.left.right.left = new TreeNode(10);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        // root.right.left.right = new TreeNode(14);
        // root.right.right = new TreeNode(4);
        
        

        Solution sol = new Solution();
        System.out.println(sol.countNodes(root));
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
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        return count(root);
    }
    private int count(TreeNode root){
        if(root == null)return 0;

        int leftSideHight = height(root, true);
        int rightSideHight = height(root, false);

        if(leftSideHight == rightSideHight) return (1 << leftSideHight) -1;

        return 1+ count(root.left) + count(root.right);
    }

    private int height(TreeNode root, boolean isLeft){
        if(root == null) return 0;
        int height = 0;
        while (root != null) {
            height++;
            root = isLeft ? root.left: root.right;
        }
        return height;
    }
}