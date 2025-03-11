import java.util.*;

class Pair<T1, T2> {
    T1 t1;
    T2 t2;
    Pair(T1 t1, T2 t2){
        this.t1 = t1;
        this.t2 = t2;
    }
    public T1 getT1() {
        return t1;
    }
    public T2 getT2() {
        return t2;
    }
}


public class AllTraversals {
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
        System.out.println(sol.getTreeTraversal(root));
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
    public static List<List<Integer>> getTreeTraversal(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Stack<Pair<TreeNode, Integer>> stack = new Stack<>();
        List<Integer> preOrder = new ArrayList<>();
        List<Integer> inOrder = new ArrayList<>();
        List<Integer> postOrder = new ArrayList<>();

        stack.push(new Pair(root, 1));// 1 is the initial state ...
        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> current = stack.pop();
            TreeNode node = (TreeNode) current.getT1();
            int state = (int) current.getT2();

            if(state == 1){
                preOrder.add(node.val);
                stack.push(new Pair(node, 2));
                if(node.left != null) stack.push(new Pair(node.left, 1));  // again we will take its 1st instance in preorder...

            }
            if(state == 2){
                inOrder.add(node.val);
                stack.push(new Pair(node, 3));
                if(node.right != null) stack.push(new Pair(node.right, 1)) ;// its 1st instance well taken in preorder... 
            }
            if(state == 3){
                postOrder.add(node.val);
            }

        }
        result.add(inOrder);
        result.add(preOrder);
        result.add(postOrder);
        return result;
    }
}