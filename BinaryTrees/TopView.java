import java.util.*;
public class TopView {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right =new TreeNode(4);
        root.left.right.right = new TreeNode(5);
        root.left.right.right.right = new TreeNode(6);
        

        Solution sol = new Solution();
        System.out.println(sol.topView(root));
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
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        TreeMap<Integer, TreeMap<Integer, Integer>> map = new TreeMap<>();
        if(root == null) return result;

        // Queue initialization...
        Queue<Object[]> q = new LinkedList<>();
        q.offer(new Object[]{root, 0, 0});

        while (!q.isEmpty()){
            Object[] coord  = q.poll();
            TreeNode node = (TreeNode)coord[0];
            int col = (int) coord[1];
            int row = (int) coord[1];

            if(node.left != null) q.offer(new Object[]{node.left, col-1, row+1});
            if(node.right != null) q.offer(new Object[]{node.right, col+1, row+1});

            map.putIfAbsent(col, new TreeMap<>());
            if(map.get(col).get(row) == null){
                map.get(col).putIfAbsent(row, node.val);
            }
            
        }

        for(Map.Entry<Integer, TreeMap<Integer, Integer>> outer:map.entrySet()){

            TreeMap<Integer, Integer> inner = outer.getValue();
            for(Map.Entry<Integer, Integer> innerMap: inner.entrySet()){
                result.add(innerMap.getValue());
            }
        }

        return result;
    }
}
