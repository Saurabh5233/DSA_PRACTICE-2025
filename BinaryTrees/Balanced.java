// package BinaryTrees;

public class Balanced {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left =new TreeNode(4);
        root.right.left = new TreeNode(5);
        // root.right.left.left = new TreeNode(7);
        // root.right.left.left.left = new TreeNode(5);

        Solution sol = new Solution();
        System.out.println(sol.isBalanced(root));
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

/*
class Solution {
    public boolean isBalanced(TreeNode root) {
        return  check(root);
    }
    private boolean check(TreeNode root){
        if(root == null) return true;

        int lh = getHeight(root.left);
        int rh = getHeight(root.right);
        return Math.abs(lh-rh) <= 1 && check(root.left) && check(root.right);
    }
    private int getHeight(TreeNode node){
        if(node == null) return 0;
        return Math.max(getHeight(node.left), getHeight(node.right))+1;
    }
}
*/

class Solution {
    public boolean isBalanced(TreeNode root) {
        return  check(root) == -1?false:true;
    }
    private int check(TreeNode root){
        if(root == null) return 0;
        int left = check(root.left);
        if(left <= -1) return -1;
        int right = check(root.right);
        if(right <= -1) return -1;

        if (Math.abs(left-right) >1 ) {
            return -1;
        }

        return Math.max(left, right)+1;
    }
    
}
