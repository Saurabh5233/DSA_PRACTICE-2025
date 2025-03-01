import java.util.*;
public class NextRightPointers {
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

        System.out.println(sol.connect(root));
    }

}

class Node{
    int val;
    Node left;
    Node right;
    Node next;
    public Node(int val){
        this.val = val;
    }
}

class Solution{
    public Node connect(Node root){
        // List<List<Node>> result  =  new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root == null) return root;
        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Node> list  =  new ArrayList<>();

            for(int i = 0;i< n;i++){
                Node curr = q.poll();
                if(curr.left!= null) q.offer(curr.left);
                if(curr.right!= null) q.offer(curr.right);
                
                list.add(curr);
            }
            // print to debuggg
            // System.out.println("\nsize: "+n);
            // for(int i = 0;i< n;i++){
            //     System.out.print(list.get(i).val+ "->");
            // }

            // System.out.println();

            int i = 0;
            for(i = 0;i< n-1;i++){
                list.get(i).next = list.get(i+1);
            }
            list.get(n-1).next =null;
            // result.add(list);

        }
        return root;
    }
}