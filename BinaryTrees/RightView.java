import java.util.*;

public class RightView {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        // root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(5);
        // root.left.right.left = new TreeNode(10);
        root.right = new TreeNode(3);
        // root.right.left = new TreeNode(4);
        // root.right.left.right = new TreeNode(14);
        root.right.right = new TreeNode(4);
        
        

        Solution sol = new Solution();
        System.out.println(sol.rightSideView(root));
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
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Object[]> q = new LinkedList<>();
        q.offer(new Object[] {root, 0});
        while (!q.isEmpty()) {
            Object[] coords = q.poll();
            TreeNode node = (TreeNode)coords[0];
            int row = (int) coords[1];
            map.put(row, node.val);
            if(node.left != null) q.offer(new Object[]{node.left, row+1});
            if(node.right != null) q.offer(new Object[]{node.right, row+1});
        }
        /*while (!q.isEmpty()) {
            int size = q.size();

            for(int i = 0;i<size;i++){
                Object[] coords = q.poll();
                TreeNode node = (TreeNode)coords[0];
                int row = (int) coords[1];
                map.put(row, node.val);
                if(node.left != null) q.offer(new Object[]{node.left, row+1});
                if(node.right != null) q.offer(new Object[]{node.right, row+1});
            }
        }*/
        result.addAll(map.values());
        return result;
    } 
}