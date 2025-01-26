package AlgoMaster.BackTracking;
import java.util.*;
public class Subsets {
    
}

class Solution {
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        solve(result, list,nums,  0);
        return result;
    }
    public void solve(List<List<Integer>> result ,List<Integer> list,int[] nums,  int  i ){
        if(i == nums.length){
            result.add(new ArrayList<>(list));
            return;
        }
        else{
            list.add(nums[i]); // include......
            solve(result, list, nums, i+1);
            list.remove(list.size()-1);  // don't include.......
            solve(result, list, nums, i+1);
        }
    }
    
}
