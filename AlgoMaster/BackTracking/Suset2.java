package AlgoMaster.BackTracking;
import java.util.*;
public class Suset2 {
    
}

class Solution{
    // each internal list may contain duplicates, but the every subset will be unique...
    public List<List<Integer>> subsetsWithDup(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        // need to sort the array so that the duplicates get adjcent so that it sould be easier to avoid starting with them again
        Arrays.sort(nums);
        solve(result, list,nums,  0);
        return result;
    }
    public void solve(List<List<Integer>> result, List<Integer> list, int[] nums, int i){
        if(i == nums.length){
            // if(!result.contains(list)){
            //     result.add(new ArrayList<>(list));
            // }
            result.add(new ArrayList<>(list));
            return;
        }

        else{
            list.add(nums[i]);
            solve(result, list, nums, i+1);
            list.remove(list.size()-1);
            while(i+1 <nums.length && nums[i] == nums[i+1]){
                i++;
            }
            solve(result, list, nums, i+1);
        }
    }
}
