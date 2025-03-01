import java.util.*;

public class ZigZagLevelOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        
        

        Solution sol = new Solution();
        System.out.println(sol.zigzagLevelOrder(root));
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){

        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> list = new ArrayList<>();
            int i = 0;
            for(i = 0;i< n;i++){
                TreeNode curr = q.poll();
                list.add(curr.val);
                if(curr.left!= null) q.offer(curr.left);
                if(curr.right!= null) q.offer(curr.right);
            }
            if (i%2!= 0) {
                Collections.reverse(list);
            }
            result.add(list);

        }
        return result;
    }
}