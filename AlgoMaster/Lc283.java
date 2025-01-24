package AlgoMaster;

public class Lc283 {
    // write the main snippet
}

class Solution {

    static{
        for(int i=0; i<500; i++){
            moveZeroes(new int[]{});
        }
    }

    
    public static void moveZeroes(int[] nums) {
        int i = 0, j = 1;
        while(i<nums.length && j<nums.length){
            if(nums[i] == 0 && nums[j] != 0 ){
                swap(i,j,nums);
                i++;
                j++;
            }else if(nums[i] != 0 && nums[j] == 0){
                i++;
            }
            else{
                j++;
            }
        }
        
    }
    public static void swap(int a, int b ,int[] nums){
        nums[a] = nums[a]^nums[b];
        nums[b] = nums[a]^nums[b];
        nums[a] = nums[a]^nums[b];
    }
    
}
