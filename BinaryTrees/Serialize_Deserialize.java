import java.util.*;
public class Serialize_Deserialize {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        // root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        // root.left.left =new TreeNode(4);
        // root.right.left = new TreeNode(4);
        // root.right.right = new TreeNode(5);

        Solution sol = new Solution();
        System.out.println(sol.serialize(root));
        String serialized = sol.serialize(root);
        TreeNode root2 = sol.deserialize(serialized);
        System.out.println(serialized.equals(sol.serialize(root2)));
        
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
    // Encodes a tree to a single string (Level Order Traversal)
    public String serialize(TreeNode root) {
        if (root == null) return "";

        StringBuilder answer = new StringBuilder();
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);

        while (!qu.isEmpty()) {
            TreeNode curr = qu.poll();
            if (curr == null) {
                answer.append("#,");
                continue;
            }
            answer.append(curr.val).append(",");
            qu.offer(curr.left);
            qu.offer(curr.right);
        }
        return answer.toString();
    }

    // Decodes your encoded data to tree
    public TreeNode deserialize(String data) {
        if (data.isEmpty()) return null;

        String[] nodes = data.split(",");
        Queue<TreeNode> queue = new LinkedList<>();

        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        queue.offer(root);
        int i = 1;  // Index for nodes array

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();

            // Process left child
            if (!nodes[i].equals("#")) {
                curr.left = new TreeNode(Integer.parseInt(nodes[i]));
                queue.offer(curr.left);
            }
            i++;

            // Process right child
            if (!nodes[i].equals("#")) {
                curr.right = new TreeNode(Integer.parseInt(nodes[i]));
                queue.offer(curr.right);
            }
            i++;
        }
        return root;
    }
}