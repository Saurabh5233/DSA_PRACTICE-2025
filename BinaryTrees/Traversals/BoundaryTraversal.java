import java.util.*;

public class BoundaryTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(2);
        // root.left.right.left = new TreeNode(10);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        // root.right.left.right = new TreeNode(14);
        root.right.right = new TreeNode(6);

        Solution sol = new Solution();
        System.out.println(sol.getBoundaryElements(root));
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

}

class Solution{
    public List<Integer> getBoundaryElements(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root == null)return result;
        
        leftSide(root, result);
        leafNodes(root, result);
        rightSide(root, result);

        result.remove(result.size()-1);
        return result;

    }

    private boolean isLeaf(TreeNode root){
        if(root == null)return false;
        return root.left == null && root.right == null;
    }

    private void leftSide(TreeNode root, List<Integer> result){
        if (root == null || isLeaf(root)) {
            return;
        }

        result.add(root.val);
        if(root.left != null) leftSide(root.left, result);
        else leftSide(root.right, result);
        return;
    }

    private void rightSide(TreeNode root, List<Integer> result){
        if(root== null)return;
        if(root.right != null) rightSide(root.right, result);
        else rightSide(root.left, result);

        if (!isLeaf(root)) {
            result.add(root.val);
        }
    }

    private void leafNodes(TreeNode root, List<Integer> result){
        if(root == null)return;
        if(isLeaf(root)){
            result.add(root.val);
        }
        leafNodes(root.left, result);
        leafNodes(root.right, result);
    }
}
