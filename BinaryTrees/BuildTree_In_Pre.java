import java.util.*;

public class BuildTree_In_Pre {
    public static void main(String[] args) {
        int inOrder[] = {9,3,15,20,7};        
        int preOrder[] = {3,9,20,15,7};        
        

        Solution sol = new Solution();
        // sol.connect(root);

        System.out.println(sol.buildTree(preOrder, inOrder));
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
        // initialize a map that stores the inorder arry elements as root with their indices...
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i< inorder.length;i++){
            map.put(inorder[i], i);
        }

        TreeNode root = buildTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, map);
        return root;
    }

    private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> map){
        if(preStart > preEnd || inStart > inEnd) return null;

        TreeNode root = new TreeNode(preorder[0]);
        // the index of the root in inorder ...
        int rootIdx = map.get(root.val);
        int leftLim = inStart - rootIdx;

        root.left = buildTree(preorder, preStart+1, preStart+ leftLim, inorder, inStart, rootIdx-1, map);
        root.right = buildTree(preorder, preStart+leftLim+1, preEnd, inorder, rootIdx+1, inEnd, map);

        return root;
    }
}