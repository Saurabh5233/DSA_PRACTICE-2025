

import java.util.*;
public class BottomView {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(8);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.left.right.left = new TreeNode(10);
        root.right = new TreeNode(22);
        root.right.left = new TreeNode(4);
        root.right.left.right = new TreeNode(14);
        root.right.right = new TreeNode(25);
        
        

        Solution sol = new Solution();
        System.out.println(sol.bottomView(root));
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
/*
class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> bottomView(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        TreeMap<Integer, TreeMap<Integer, List<Integer>>> map = new TreeMap<>();
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
            map.get(col).putIfAbsent(row, new ArrayList<>());
            map.get(col).get(row).add(node.val);

            
        }

        for(Map.Entry<Integer, TreeMap<Integer, List<Integer>>> outer:map.entrySet()){

            TreeMap<Integer, List<Integer>> inner = outer.getValue();
            for(Map.Entry<Integer, List<Integer>> innerMap: inner.entrySet()){
                List<Integer> lst = innerMap.getValue();
                result.add(lst.get(lst.size()-1));
            }
        }

        return result;
    }
}

 */

 class Solution{
    static ArrayList<Integer> bottomView(TreeNode root){
        ArrayList<Integer> answer = new ArrayList<>();
        // create a Treemap of type <Integer, Integer> ro keep the track of latest node ouccering in a column in ascending order...
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Object[]> q = new LinkedList<>();
        q.offer(new Object[]{root, 0}); // root node with its column ..
        while (!q.isEmpty()) {
            Object[] curr = q.poll();
            TreeNode node = (TreeNode) curr[0];
            int col = (int) curr[1];
            map.put(col, node.val);
            if(node.left != null) q.offer(new Object[]{node.left, col-1});
            if(node.right != null) q.offer(new Object[]{node.right, col+1});
        }
        answer.addAll(map.values());
        return answer;
    }
 }

