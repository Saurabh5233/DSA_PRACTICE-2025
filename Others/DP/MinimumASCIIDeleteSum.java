package Others.DP;

public class MinimumASCIIDeleteSum {
    
}


// To return the MinimumASCIIDeleteSum of all the deleted elements.......
/*
class Solution {
    public int minDistance(String word1, String word2){
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i = 0;i< m+1;i++){
            for(int j = 0;j <n+1;j++){
                
                if(i == 0 ){
                    dp[0][j] = j;
                }else if(j== 0){
                    dp[i][j] = i;
                }
                else if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = 1+ Math.min(dp[i][j-1] , dp[i-1][j]);
                }
                
            }
        }
        return dp[m][n];
    }
}

*/

/// Memoization......


class Solution {
    public int minDistance(String word1, String word2){
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i = 0;i< m+1;i++){
            for(int j = 0;j <n+1;j++){
                
                dp[i][j] = -1;
                
            }
        }
        int minSum = solve(word1, word2, n, m, dp);
        return minSum;
    }

    
    public int solve(String word1, String word2, int i, int j, int[][] dp){
        if(i == -1) {
            int sum = 0;
            for(int k = j;k >=0;k--){
                sum += (int)word2.charAt(k);
            }
            return sum;
        }
        if(j == -1) {
            int sum = 0;
            for(int k = i;k >=0;k--){
                sum += (int)word1.charAt(k);
            }
            return sum;
        }

        if(dp[i][j] != -1){
            return dp[i][j] ;
        }

        else if(word1.charAt(i) == word2.charAt(j)){
            dp[i][j] = solve(word1, word2, i-1, j-1, dp);
        }else{
            dp[i][j] =  Math.min((int)solve(word1, word2, i-1, j, dp), (int)solve(word1, word2, i, j-1, dp));
        }
        return dp[i][j] ;
    }
}

