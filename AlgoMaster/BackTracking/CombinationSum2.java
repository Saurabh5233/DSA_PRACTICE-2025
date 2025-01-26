package AlgoMaster.BackTracking;
import java.util.*;
public class CombinationSum2 {
    
}


class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        // need to sort to ensure same elements are adjecent and to avoid starting with them again...
        Arrays.sort(candidates);

        solve(result, list, candidates, target, 0);
        return result;
    }
    public void solve(List<List<Integer>> result, List<Integer> list, int[] candidates, int target, int i){
        if(target == 0){
            result.add(new ArrayList<>(list));
            return;
        }
        if(i >= candidates.length || target < 0){ // i should go upto candidates.length-1
            return;
        }

        else{
            list.add(candidates[i]);
            solve(result, list, candidates, target-candidates[i], i+1);
            list.remove(list.size()-1);
            while(i+1 < candidates.length && candidates[i] == candidates[i+1]){
                i++;
            }
            solve(result, list, candidates, target, i+1);

        }
    }

    
}
