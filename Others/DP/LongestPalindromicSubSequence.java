package Others.DP;

public class LongestPalindromicSubSequence {
    
}
/*
class Solution {
    public int longestPalindromeSubseq(String s){
        int  len = s.length();
        return solve(s,0, len-1);
    }

    public int solve( String s, int i , int j){
        // if i == j, means odd length palindeome, 
        if(i == j){
            return 1;
        }
        if(i > j){ // i and j crossed, means even length palindeome
            return 0;
        }
        else if(s.charAt(i) == s.charAt(j)){
            return 2 + solve(s, i+1, j-1);
        }
        else{
            return Math.max(solve(s, i+1, j), solve(s, i, j-1));
        }
    }
}

*/

// Memoization....
/*
class Solution {
    public int longestPalindromeSubseq(String s){
        int  len = s.length();
        int[][] dp = new int[len+1][len+1];
        for(int i = 0;i< len;i++){
            for(int j = 0;j< len;j++){
                
                dp[i][j] = -1;
                
            }
        }
        return solve(s,0, len-1, dp);
    }

    public int solve( String s, int i , int j, int[][] dp){
        // if i == j, means odd length palindeome, 
        if(i == j){
            return 1;
        }
        if(i > j){ // i and j crossed, means even length palindeome
            return 0;
        }
        else if(s.charAt(i) == s.charAt(j)){
            dp[i][j] =  2 + solve(s, i+1, j-1, dp);
        }
        else{
            dp[i][j] =  Math.max(solve(s, i+1, j, dp), solve(s, i, j-1, dp));
        }
        return dp[i][j];
    }
}

*/


// Tabulation...
/* */
class Solution {
    public int longestPalindromeSubseq(String s){
        int  len = s.length();
        int[][] dp = new int[len+1][len+1];
        // we will traverse diagonaly ..
        for(int diagonal = 1;diagonal<= len;diagonal++){
            for(int i = 0;i< len;diagonal++){
                int j = diagonal+ i -1;
                if(i == j){
                    dp[i][j] = 0;
                }
                else if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = 2+ dp[i+1][j-1];

                }else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i+1][j]);
                }
            }
        }
        return dp[0][len-1];
    }

}
