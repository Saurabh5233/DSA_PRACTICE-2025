package AlgoMaster.BackTracking;
import java.util.*;
public class Combinations {
    
}


// brute force aproach
/* 
class Solution {
    public public List<List<Integer>> combine(int n, int k){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int[] nums = new int[n];
        solve(result, list,nums, 0, k)
        return result;
    }
    public void solve(List<List<Integer>> result ,List<Integer> list,int[] nums,  int  i, int k ){
        if(i == nums.length){
            if(list.size() == k){
                result.add(new ArrayList<>(list));
            }
            return;
        }
        else{
            list.add(nums[i]); // include......
            solve(result, list, nums, i+1, k);
            list.remove(list.size()-1);  // don't include.......
            solve(result, list, nums, i+1, k);
        }
    }
    
}
 */

// better approach...

class Solution {
    public List<List<Integer>> combine(int n, int k){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        solve(result, list, 0, n, k);
        return result;
    }
    public void solve(List<List<Integer>> result ,List<Integer> list,int start,  int  n, int k ){
        if(k==0){  // this is done coz we will reduce k by one in every call...
            
            result.add(new ArrayList<>(list));
            return;
        }
        else{
            // here we will start from the ith index and run it n-k+1 times to ensure the length of items added in the list is exactly k
            for(int i = start; i < n-k+1; i++){
                list.add(i);  // including ith element 
                solve(result, list, i+1, n, k-1);    // reduce k by 1;
                list.remove(list.size()-1); // discarding the last element
            }
        }
    }
}
    