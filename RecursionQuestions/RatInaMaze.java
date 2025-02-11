import java.util.*;
public class RatInaMaze {
    
}


class Solution {
    // Function to find all possible paths
    public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        ArrayList<String> result = new ArrayList<>();
        int n = mat.size();
        StringBuilder sb = new StringBuilder();
        solve(mat, result, sb, 0, 0, n);
        
        return result;
    }
    private void solve(ArrayList<ArrayList<Integer>> mat, ArrayList<String> result, StringBuilder path, int i, int j, int n){
        if(i == n-1 && j == n-1){
            result.add(path.toString());
            return ;
        }
        
        mat.get(i).set(j, 0);
        
        
        //Down check...
        if(i<n-1 && mat.get(i+1).get(j) == 1){
            path.append("D");
            solve(mat, result, path, i+1, j, n);
            path.deleteCharAt(path.length()-1);
        }
        
        //Left check...
        if(j>0 && mat.get(i).get(j-1) == 1){
            path.append("L");
            solve(mat, result, path, i, j-1, n);
            path.deleteCharAt(path.length()-1);
        }
        
        //Right check...
        if(j<n-1  && mat.get(i).get(j+1) == 1){
            path.append("R");
            solve(mat, result, path, i, j+1, n);
            path.deleteCharAt(path.length()-1);
        }
        
        //Up check...
        if(i> 0 && mat.get(i-1).get(j) == 1){
            path.append("U");
            solve(mat, result, path, i-1, j, n);
            path.deleteCharAt(path.length()-1);

        }
        
        
        
        
        mat.get(i).set(j, 1);
        
        return;
            
    }
}