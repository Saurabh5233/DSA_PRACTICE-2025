// package BinaryTrees;

public class Diameter {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left =new TreeNode(4);
        root.right.left = new TreeNode(5);
        // root.right.left.left = new TreeNode(7);
        // root.right.left.left.left = new TreeNode(5);

        Solution sol = new Solution();
        System.out.println(sol.diameterOfBinaryTree(root));
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
    
    public int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        findDiameter(root);
        return diameter;

    }
    private int findDiameter(TreeNode root){
        if(root == null) return 0;
        int leftH = findDiameter(root.left);
        int rightH = findDiameter(root.right);

        diameter = Math.max(diameter, leftH + rightH);
        
        return  1+ Math.max(leftH, rightH);
    }
}
