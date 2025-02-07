import java.util.ArrayList;
import java.util.List;

public class SubSequences {
    public static void main(String[] args) {
        int nums[] = {1,2};

        generateSubsets(nums);
    }

    public static void generateSubsets(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        solve(res,ans,0,nums);
        System.out.println(res);
    }
    private static void solve(List<List<Integer>> res, List<Integer> ans, int i , int[] nums){
        if(i == nums.length){
            res.add(new ArrayList<>(ans));
            return;
        }
        else{
            ans.add(nums[i]);
            solve(res, ans, i+1, nums);
            ans.remove(ans.size()-1);
            solve(res, ans, i+1, nums);
        }
    }
}
