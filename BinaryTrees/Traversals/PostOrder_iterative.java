import java.util.*;

// package BinaryTrees.Traversals;

public class PostOrder_iterative {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left =new TreeNode(4);
        root.right.left = new TreeNode(5);

        Solution sol = new Solution();
        System.out.println(sol.postOrder(root));
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
    // using Two Stacks...
    /*
    public List<Integer> postOrder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stk1 = new Stack<>();
        Stack<TreeNode> stk2 = new Stack<>();
        // TreeNode curr = root;
        if(root == null) return result;
        stk1.push(root);
        while (!stk1.isEmpty()) {
            TreeNode curr= stk1.pop();
            stk2.push(curr);
            if(curr.left != null) stk1.push(curr.left);
            if(curr.right != null) stk1.push(curr.right);

        }
        while(!stk2.isEmpty()){
            result.add(stk2.pop().val);
        }

        return result;
    }
    */

    // using one stack...
    public List<Integer> postOrder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();
        // TreeNode curr = root;
        if(root == null) return result;
        stk.push(root);
        while (!stk.isEmpty()) {
            TreeNode curr= stk.pop();
            result.add(0, curr.val);
            
            if(curr.left != null) stk.push(curr.left);
            if(curr.right != null) stk.push(curr.right);

        }
        

        return result;
    }
}

