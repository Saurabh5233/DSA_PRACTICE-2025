package Others;

import java.util.Arrays;

public class MinimumIncrementToMakeArrayUnique {
    
}

class Solution{
    public int minIncrementForUnique(int[] nums){
        int n= nums.length;
        Arrays.sort(nums);
        int steps = 0;
        for(int i =1;i< n;i++){
            int diff = 0;
            if(nums[i] <= nums[i-1]){
                diff = nums[i-1] - nums[i] +1;
                nums[i]+=diff;
                steps += diff;
            }
        }
        return steps;
    }
}

