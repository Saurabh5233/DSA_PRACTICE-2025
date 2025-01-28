package Others.DP;

public class LongestCommonSubseq {

}
/*
 * class Solution{
 * public int longestCommonSubsequence(String text1, String text2){
 * int maxCommSubseq = solve(text1, text2, text1.length()-1, text2.length()-1);
 * return maxCommSubseq;
 * }
 * 
 * public int solve(String text1, String text2, int i , int j){
 * if(i == -1 || j == -1 ){
 * return 0;
 * }
 * else if (text1.charAt(i) == text2.charAt(j)) {
 * return 1+ solve(text1, text2, i-1, j-1);
 * }
 * else{
 * return Math.max(solve(text1, text2, i, j-1), solve(text1, text2, i-1, j));
 * }
 * 
 * }
 * }
 */


 /*
 // Memoization.....
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for (int i = 0; i < text1.length() + 1; i++) {
            for (int j = 0; j < text2.length() + 1; j++) {
                dp[i][j] = -1;
            }
        }
        int maxCommSubseq = solve(text1, text2, text1.length() - 1, text2.length() - 1, dp);
        return maxCommSubseq;
    }

    public int solve(String text1, String text2, int i, int j, int[][] dp) {
        if (i == -1 || j == -1) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        } else if (text1.charAt(i) == text2.charAt(j)) {
            dp[i][j] = 1 + solve(text1, text2, i - 1, j - 1, dp);
        } else {
            dp[i][j] = Math.max(solve(text1, text2, i, j - 1, dp), solve(text1, text2, i - 1, j, dp));
        }
        return dp[i][j];
    }
}

*/

// Tabulation.....
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for (int i = 0; i < text1.length() + 1; i++) {
            for (int j = 0; j < text2.length() + 1; j++) {
                if(i == 0 || j== 0){
                    dp[i][j] = 0;
                }
                else if(text1.charAt(i) == text2.charAt(j)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }

    
}


