// package Others;
import java.util.*;


// Using Prefix Sum technique for this problem....
public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        // int[] arr = {-1,1,0,-3,3};

        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.productExceptSelf(arr)));
    }

}


class Solution{

    // the below solution is taking O(2n) spaceComplexity and O(n) timecomplexity
    /* 
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixProd = new int[n];
        int[] suffixProd = new int[n];

        //calculate the product of the elements before the current and keep adding them to the prefisProd
        prefixProd[0] = 1;
        for(int i = 1;i< nums.length;i++){
            prefixProd[i] = nums[i-1] * prefixProd[i-1];
        }

        // doing the same for the suffix products....
        suffixProd[n-1] = 1;
        for(int i = n-2;i>=0;i--){
            suffixProd[i] = nums[i+1]* suffixProd[i+1];
        }

        for(int i = 0;i< n;i++){
            nums[i] = prefixProd[i]*suffixProd[i];
        }
        return nums;

    }
    */
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        

        //calculate the product of the elements before the current and keep adding them to the to the Answer array.... 
        answer[0] = 1;
        for(int i = 1;i< nums.length;i++){
            answer[i] = nums[i-1] * answer[i-1];
        }

        // now update the answer array with the suffix products...
        int prev = 1;
        for(int i = n-2;i>=0;i--){
            prev = prev* nums[i+1];
            answer[i] = prev* answer[i];
        }


        
        return answer;

    }


}

