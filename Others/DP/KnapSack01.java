package Others.DP;
/*

public class KnapSack01 {

    public static void main(String[] args) {
        int wt[] = new int[] { 60, 100, 120 };
        int val[] = new int[] { 10, 20, 30 };
        int n = val.length;
        int W = 50;

        System.out.println(solve(wt, val, n-1, W)); 
    }

    public static int solve(int[] wt, int[] val, int i, int j){
        // in case capacity becomes 0 or the index is at -1;
        // base case
        if(i == -1 || j == 0){
            return 0;
        }

        // if the weight at the ith idx is greater than the capacity, don't take it...
        if(wt[i] > j){
            return solve(wt, val, i-1, j);
        }
        else{
            // here we will follow the technique of take it or leave it so as to cover all the subsequences........
            // take it.. only if the wt[i] <= capacity..
            int taken = 0;
            if(wt[i] <= j) {
                taken = val[i] + solve(wt, val, i-1, j-wt[i]); 
            }
            // leave it..
            int left = solve(wt, val, i-1, j);

            return Math.max(taken, left);
        }
        
    }
}

*/

// Memoization.....

/*
public class KnapSack01 {

    public static void main(String[] args) {
        int wt[] = new int[] { 60, 100, 120 };
        int val[] = new int[] { 10, 20, 30 };
        int n = val.length;
        int W = 50;
        int[][] dp = new int[n+1][W+1];
        for(int i = 0;i <= n;i++){
            for (int j = 0; j <= W; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(solve(wt, val, n-1, W, dp)); 
    }

    public static int solve(int[] wt, int[] val, int i, int j, int[][] dp){
        // in case capacity becomes 0 or the index is at -1;
        // base case
        if(i == -1 || j == 0){
            return 0;
        }

        if(dp[i][j] != -1) return dp[i][j];

        // if the weight at the ith idx is greater than the capacity, don't take it...
        if(wt[i] > j){
            dp[i][j] =  solve(wt, val, i-1, j, dp);
        }
        else{
            // here we will follow the technique of take it or leave it so as to cover all the subsequences........
            // take it.. only if the wt[i] <= capacity..
            int taken = 0;
            if(wt[i] <= j) {
                taken = val[i] + solve(wt, val, i-1, j-wt[i], dp); 
            }
            // leave it..
            int left = solve(wt, val, i-1, j, dp);

            dp[i][j] =  Math.max(taken, left);
        }
        return dp[i][j];
    }
}
*/

// Tabulation.....\


public class KnapSack01 {

    public static void main(String[] args) {
        int wt[] = new int[] { 60, 100, 120 };
        int val[] = new int[] { 10, 20, 30 };
        int n = val.length;
        int W = 50;
        int[][] dp = new int[n+1][W+1];
        for(int i = 0;i <= n;i++){
            for (int j = 0; j <= W; j++) {
                if(i == 0 || j== 0){
                    dp[i][j] = 0;

                }
                // if wt[i]> capacity, leave it...
                else if( wt[i-1]> j){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] =  Math.max(
                        val[i-1] + dp[i-1][j-wt[i-1]], dp[i-1][j]
                    );
                }
            }
        }

        System.out.println(dp[n][W]);; 
    }
}