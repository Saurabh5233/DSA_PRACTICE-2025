package Others.DP;

public class EditDistance {

}
/*
class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        return solve(word1, word2, 0, 0);
    }

    public int solve(String word1, String word2, int i, int j) {
        if (i == -1)
            return j + 1; // in case one of the indexes i or j has come to -1 the other shoult delete
                          // corresponding i+1 or j+1 characters to match
        if (j == -1)
            return i + 1;

        // when the characters at i and j th index are equal
        if (word1.charAt(i) == word2.charAt(j)) {
            return solve(word1, word2, i - 1, j - 1);
        } else {
            // from here we can do 3 operations delete , insert and replace
            return Math.min(
                    1 + solve(word1, word2, i - 1, j - 1), // replace
                    Math.min(
                            1 + solve(word1, word2, i - 1, j), // delete either
                            1 + solve(word1, word2, i, j - 1) // insert before either
                    )

            );
        }

    }

}

*/


// memoization
/* 
class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i = 0;i<= n;i++){
            for(int j = 0;j<= m;j++){
                dp[i][j] = -1;
            }
        }
        return solve(word1, word2, 0, 0, dp);
    }

    public int solve(String word1, String word2, int i, int j, int[][] dp) {
        if (i == -1)
            return j + 1; // in case one of the indexes i or j has come to -1 the other shoult delete
                          // corresponding i+1 or j+1 characters to match
        if (j == -1)
            return i + 1;

        if(dp[i][j]!= -1) return dp[i][j];

        // when the characters at i and j th index are equal
        if (word1.charAt(i) == word2.charAt(j)) {
            dp[i][j] = solve(word1, word2, i - 1, j - 1, dp);
        } else {
            // from here we can do 3 operations delete , insert and replace
            dp[i][j]= Math.min(
                    1 + solve(word1, word2, i - 1, j - 1, dp), // replace
                    Math.min(
                            1 + solve(word1, word2, i - 1, j, dp), // delete either
                            1 + solve(word1, word2, i, j - 1, dp) // insert before either
                    )

            );
        }
        return dp[i][j];

    }

}

*/


// Tabulation ...............

class Solution {
    public int minDistance(String word1, String word2) {
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
                    dp[i][j] = Math.min(
                        1+ dp[i-1][j-1], // replace
                        Math.min(
                            1+ dp[i][j-1], // delete
                            1+ dp[i-1][j]
                        )
                    );
                }
                
            }
        }
        return dp[m][n];

    }
    
}