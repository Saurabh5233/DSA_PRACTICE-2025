import java.util.*;
// package BinaryTrees.Traversals;

// import javax.swing.tree.TreeNode;

public class PreOrder_Iterative {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left =new TreeNode(4);
        root.right.left = new TreeNode(5);

        Solution sol = new Solution();
        System.out.println(sol.preOrder(root));
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
    // Let there is a TreeNode class that helps initialize any node of a tree
    public List<Integer> preOrder(TreeNode root){
        List<Integer> pre = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();
        if(root == null) return pre;
        stk.push(root);
        while (!stk.isEmpty()) {
            TreeNode curr = stk.pop();
            pre.add(curr.val);
            if(curr.right != null) stk.push(curr.right);
            if(curr.left != null) stk.push(curr.left);
        }

        return pre;
    }
}
