import java.util.HashMap;
import java.util.Map;

public class BuildTree_In_Post {
    public static void main(String[] args) {
        int inOrder[] = {9,3,15,20,7};        
        int postorder[] = {9,15,7,20,3};        
        

        Solution sol = new Solution();
        // sol.connect(root);

        System.out.println(sol.buildTree(postorder, inOrder));
    }

}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode next;
    public TreeNode(int val){
        this.val = val;
    }
}


class Solution {
    public TreeNode buildTree(int[] postorder, int[] inorder){
        if (inorder == null || postorder == null || inorder.length != postorder.length) {
            return null;

        }
        

        TreeNode root = buildTree(postorder, 0, postorder.length-1, inorder, 0, inorder.length-1);
        return root;
    }

    private TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
        // Base case
        if (inStart > inEnd || postStart > postEnd) {
            return null;
        }
        
        // Find the root node from the last element of postorder traversal
        int rootVal = postorder[postEnd];
        TreeNode root = new TreeNode(rootVal);
        
        // Find the index of the root node in inorder traversal
        int rootIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }
        
        // Recursively build the left and right subtrees
        int leftSize = rootIndex - inStart;
        int rightSize = inEnd - rootIndex;
        root.left = buildTree(inorder, inStart, rootIndex - 1, postorder, postStart, postStart + leftSize - 1);
        root.right = buildTree(inorder, rootIndex + 1, inEnd, postorder, postEnd - rightSize, postEnd - 1);
        
        return root;
    }
}