import java.util.*;
public class CombinationSum3 {
    
}

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        solve(result, answer, k, n, 1);
        return result;
    }
    private void solve(List<List<Integer>> result, List<Integer> answer, int k ,int n, int i){
       
        if(answer.size() == k &&n == 0){
            
            result.add(new ArrayList<>(answer));
            return;
        }
        else{
            
            for(int p = i;p< 10;p++){
                if(answer.size() >k || n-p <0) break;
                answer.add(p);
                solve(result, answer, k , n-p, p+1);
                answer.remove(answer.size()-1);
            }
    
        }
    }
}
