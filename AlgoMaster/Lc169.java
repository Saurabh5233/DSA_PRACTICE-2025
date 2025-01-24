package AlgoMaster;

public class Lc169 {
//Main snippet
}
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> majority = new HashMap<>();
        for(int i= 0;i< nums.length;i++){
            majority.put(nums[i], majority.getOrDefault(nums[i],0)+1);

        }
        for(int i = 0;i< nums.length;i++){
            if(majority.get(nums[i]) > (nums.length/2)){
                return nums[i];
            }
        }
        return -1;
    }
}