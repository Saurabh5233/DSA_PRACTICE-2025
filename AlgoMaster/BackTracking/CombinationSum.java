package AlgoMaster.BackTracking;
import java.util.*;
public class CombinationSum {
    
}


class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        solve(result, list, candidates, target, 0);
        return result;
    }
    public void solve(List<List<Integer>> result, List<Integer> list, int[] candidates,int target, int i){
        if(target == 0){
            result.add(new ArrayList<>(list));
            return;
        }
        if(i >= candidates.length || target < 0){
            return;
        }
        else{


            // we will keep adding the same element until we get the sum , coz the question allows duplicates...
            list.add(candidates[i]);
            solve(result, list, candidates, target-candidates[i], i); // don't increment i so as to take it again
            list.remove(list.size()-1);
            solve(result, list, candidates, target, i+1); 
        }
    }
}
