import java.util.*;

public class MaxWidth {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(2);
        // root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(9);
        
        

        Solution sol = new Solution();
        System.out.println(sol.widthOfBinaryTree(root));
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
    public int widthOfBinaryTree(TreeNode root){
        int maxWidth = 0;
        Queue<Object[]> q = new LinkedList<>(); 
        if(root == null) return maxWidth;
        q.offer(new Object[]{root, 0});
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0;i< size;i++){
                Object[] curr = q.poll();
                TreeNode node = (TreeNode)curr[0];
                int idx = (int) curr[1];
                list.add(idx);
                if(node.left != null) q.offer(new Object[]{node.left, idx*2+1});
                if(node.right != null) q.offer(new Object[]{node.right, idx*2+2});
            }
            maxWidth =  Math.max(maxWidth,1+ list.get(list.size()-1) - list.get(0));

        } 
        return maxWidth;
    }
}