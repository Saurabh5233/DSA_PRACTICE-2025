import java.util.*;
// package BinaryTrees.Traversals;

public class inOrder_iterative {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left =new TreeNode(4);
        root.right.left = new TreeNode(5);

        Solution sol = new Solution();
        System.out.println(sol.inOrder(root));
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
    public List<Integer> inOrder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();
        TreeNode curr = root;
        while (true) {
            if(curr != null){
                stk.push(curr);
                curr = curr.left;
            }
            else{
                if(stk.isEmpty()){
                    break;
                }
                curr = stk.pop();
                result.add(curr.val);
                curr = curr.right;
            }
        }

        return result;
    }
}

