// package Others.HomeWorks;

import java.util.Scanner;

public class TripletsEven {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // int[] nums = {2,4,3,2};
        int[] nums = {1,3,5,2,4};

        int count = solve(nums);
        System.out.println(count);
    }
    
    public static int solve(int[] nums){
        int n = nums.length;
        if(n< 3) return 0;

        int totalCombinatinos  = n*(n-1)*(n-2) /6; 
        int odds = 0;
        for(int i : nums){
            if(i %2 != 0) odds++;
        }

        int oddCombinations  = odds* (odds-1)*(odds-2) / 6;

        return totalCombinatinos - oddCombinations;
    }
}
