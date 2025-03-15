import java.util.*;

public class BurningTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        // root.left.left = new Node(5);
        root.left.right = new Node(5);
        // root.left.right.left = new Node(10);
        root.right = new Node(3);
        // root.right.left = new Node(4);
        // root.right.left.right = new Node(14);
        root.right.right = new Node(4);
        
        

        Solution sol = new Solution();
        System.out.println(sol.minTime(root, 5));
    }

}

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
    }
}

class Solution{
    public static int minTime(Node root, int target) {
        if( root == null ) return 0;

        Map<Node, Node> back = new HashMap<>();
        // find the target node if not already provided and map the back traversal
        Node targetNode = findAndMap(root, target, back);

        if (targetNode == null)return 0;    
        
        // traverse radially outwards from the targetNode and burn the nodes
        int time = radialTraverse(targetNode, back);
        return time;
        
    }

    private static Node findAndMap(Node root, int target, Map<Node, Node> back){
        if(root== null)return null;
        Queue<Node> qu = new LinkedList<>();
        qu.offer(root);
        Node targetNode = null;

        while(!qu.isEmpty()){
            Node curr = qu.poll();
            if(curr.data == target) targetNode = curr;

            if(curr.left != null){
                back.put(curr.left, curr);
                qu.offer(curr.left);
            }
            if(curr.right != null){
                back.put(curr.right, curr);
                qu.offer(curr.right);
            }
        }
        return targetNode;
    }

    private static int radialTraverse(Node targertNode, Map<Node, Node> back){
        Set<Node> vis = new HashSet<>();
        
        int time = 0;
        Queue<Node> qu = new LinkedList<>();
        if (targertNode == null) {
            return 0;
        }
        qu.offer(targertNode);
        vis.add(targertNode);

        while (!qu.isEmpty()) {
            int n = qu.size();
            boolean burnt = false;

            for (int i = 0; i < n; i++) {
                Node curr = qu.poll();
                if(curr.left != null && !vis.contains(curr.left)){
                    vis.add(curr.left);
                    qu.offer(curr.left);
                    burnt = true;
                }
                if(curr.right != null && !vis.contains(curr.right)){
                    vis.add(curr.right);
                    qu.offer(curr.right);
                    burnt = true;
                }
                if(back.containsKey(curr) && !vis.contains(back.get(curr))){
                    vis.add(back.get(curr));
                    qu.offer(back.get(curr));
                    burnt = true;
                }
            }
            if(burnt)time++;
        }

        return time;

    }


}



