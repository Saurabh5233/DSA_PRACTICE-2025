package Others;

public class NextPermutation {
    
}

//  [1,8, 8,8, 9, 4, 5, 6, 3, 2]
// find the index of the first number which is decreasing from right to left.
// check if the number at the obtained index is smaller than any of the nums from the right
// if found swap..
// now reverse the numbers from idx +1 to the last to get the next greater permutation...

class Solution{
    public void nextPermutation(int[] nums){
        int n = nums.length;
        int idx = -1;

        // find the index at which nums is decreasing
        for(int i = n-2;i >=0;i--){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }

        // find the number which is greater than the num at this index..
        if(idx != -1){      // only do this if the idx has changed to some +ve value.
            for(int i = n-1;i>idx;i--){
                if(nums[idx] < nums[i]){
                    nums[idx] = nums[idx]^ nums[i];
                    nums[i] = nums[idx]^ nums[i];
                    nums[idx] = nums[idx]^ nums[i];
                    break;
                }
            }
        }
        

        // reverse the remaining array after the 'idx' to get the next greater permutataion
        int start = idx+1, end = n-1;
        while(start < end){
            nums[start] = nums[end]^nums[start];
            nums[end] = nums[end]^nums[start];
            nums[start] = nums[end]^nums[start];
            start++;
            end--;
        }
        return ;

    }
}
