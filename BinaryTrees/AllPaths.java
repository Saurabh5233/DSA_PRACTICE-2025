import java.util.*;

public class AllPaths {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // root.left.right.left = new TreeNode(10);
        root.right = new Node(3);
        // root.right.left = new TreeNode(4);
        // root.right.left.right = new TreeNode(14);
        root.right.right = new Node(7);
        
        

        Solution sol = new Solution();
        // sol.connect(root);

        System.out.println(sol.Paths(root));
    }

}

class Node{
    int data;
    Node left;
    Node right;
    Node next;
    public Node(int data){
        this.data = data;
    }
}





class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        ArrayList<Integer> list = new ArrayList<>();
        
        solve(root, result, list);

        return result;
    }
    
    private static void solve(Node root, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list){
        if(root == null)return;
        if(root.left == null && root.right ==null){
            list.add(root.data);
            result.add(new ArrayList<>(list));
            list.remove(list.size()-1);
        }
        
        list.add(root.data);
        if(root.left != null) solve(root.left, result, list);
        

        if(root.right != null) solve(root.right, result, list);
        list.remove(list.size()-1);
    }
}
