import java.util.*;

public class FlattenBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left =new TreeNode(4);
        root.right.left = new TreeNode(5);

        Solution sol = new Solution();
        System.out.println(preorderTraversal(root));
        System.out.println();
        sol.flatten(root);

        System.out.println(preorderTraversal(root));

    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();

        solve(answer, root);
        return answer;
    }
    private static void solve(List<Integer> answer, TreeNode root){
        if(root==null)return ;
        answer.add(root.val);
        solve(answer, root.left);
        solve(answer, root.right);
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



// class Solution {
//     public void flatten(TreeNode root) {
//         List<TreeNode> preOrder = preorderTraversal(root);
//         if(root == null ) return;
//         // remove everything from the root initially...
//         root.left = null;
//         root.right = null;
//         TreeNode prev = root;
//         for(int i = 1; i< preOrder.size();i++){
//             prev.left = null;
//             prev.right = preOrder.get(i);
//             prev = prev.right;
//         }
//         return;
//     }


//     public List<TreeNode> preorderTraversal(TreeNode root) {
//         List<TreeNode> answer = new ArrayList<>();

//         solve(answer, root);
//         return answer;
//     }
//     private void solve(List<TreeNode> answer, TreeNode root){
//         if(root==null)return ;
//         answer.add(root);
//         solve(answer, root.left);
//         solve(answer, root.right);
//     }

//     // the below code uses morris traversal, to reduce space complexity.....
//     /*
//     public List<TreeNode> preorderTraversal(TreeNode root) {
//         List<TreeNode> result = new ArrayList<>();
//         if(root == null) return result;
//         TreeNode cur = root;

//         // we will keep traversing cur to left until the cur reaches null..
//         while(cur != null){
//             // case 1 , when cur.left is null, add to list and move to right...
//             if(cur.left == null){
//                 result.add(cur);
//                 cur = cur.right;
//             }
//             else{
//                 // for every left element move to the right most element and connect it to the cur...
//                 TreeNode prev = cur.left;
//                 while(prev.right != null && prev.right != cur){
//                     prev = prev.right;
//                 }

//                 //case 1, when prev.right is null at the rightmost element, connect it to the cur and move cur to left....
//                 if(prev.right == null){
//                     prev.right = cur; // thread connected back to the previous root..
//                     result.add(cur);
//                     cur= cur.left;
//                 }else{
//                     //when the rightmost element is already threaded to the previous root.., remove the thread and push the prev to the result and move the curr to right coz left side has been traversed...
//                     prev.right = null;
//                     cur = cur.right;
//                 }

//             }
//         }
//         return result;
//     }
//     */

// }


// recursive approach , without using extra space

class Solution{
    TreeNode prev = null;
    public void flatten(TreeNode root) {
        if(root== null) return;
        solve(root);
    }
    private void solve(TreeNode root){
        if(root == null)return;

        solve(root.right);
        solve(root.left);
        root.right = prev;
        root.left = null;
        prev = root; 
        return;
    }
}