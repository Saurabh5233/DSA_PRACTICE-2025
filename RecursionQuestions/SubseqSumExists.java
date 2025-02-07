public class SubseqSumExists {
    /// GFG Problem: Check if there exists a subsequence with sum K

}


class Solution {
    public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
      return solve(arr, 0, 0, K);
  
    }
    private static boolean solve(int[] arr, int i, int sum, int K){
        if(sum > K) return false;
        if(i == arr.length){
            if(sum == K)return true;
            else return false;
        }
        
        //Include current element....
        if(solve(arr, i+1, sum + arr[i], K))return true;
        
        // Exclude current element....
        if(solve(arr, i+1, sum, K))return true;
        
        return false;
    }
  }
