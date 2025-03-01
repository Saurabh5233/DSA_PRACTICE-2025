import java.util.*;
public class VerticalTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left =new TreeNode(4);
        root.right.left = new TreeNode(5);
        // root.right.left.left = new TreeNode(7);
        // root.right.left.left.left = new TreeNode(5);

        Solution sol = new Solution();
        System.out.println(sol.verticalTraversal(root));
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
    public List<List<Integer>> verticalTraversal(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        // creating a treemap to store the traversed nodes with their coordinates in ascending order of their verticle or col
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        //Initialize a queue to keep track of the nodes and their corrdinates in BFS order..
        Queue<Object[]> q = new LinkedList<>();

        // initially push the root to the queue;
        q.offer(new Object[]{root, 0, 0});   // root, col, row....

        while(!q.isEmpty()){
            Object[] coords = q.poll();
            TreeNode node = (TreeNode) coords[0];
            int col = (int) coords[1];
            int row = (int) coords[2];
            if(node.left!= null) q.offer(new Object[]{node.left, col-1, row+1});
            if(node.right!= null) q.offer(new Object[]{node.right, col+1, row+1});
            // now put these values in the TreeMap to keep them in ascending order of their column..
            map.putIfAbsent(col,new TreeMap<>());
            map.get(col).putIfAbsent(row, new PriorityQueue<>());
            map.get(col).get(row).offer(node.val);
        }

        // now traverse into the treemap and keep poping values until empty...
        for(Map.Entry<Integer, TreeMap<Integer, PriorityQueue<Integer>>> outerMap: map.entrySet()){
            List<Integer> list = new ArrayList<>();
            TreeMap<Integer, PriorityQueue<Integer>> innerMap= outerMap.getValue();
            for (Map.Entry<Integer, PriorityQueue<Integer>> inner : innerMap.entrySet()) {
                PriorityQueue<Integer> pq = inner.getValue();
                while (!pq.isEmpty()) {
                    list.add(pq.poll());
                }
            } 
            result.add(list);
        }

        return result;

    }
}