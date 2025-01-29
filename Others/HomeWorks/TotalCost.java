package Others.HomeWorks;

import java.util.*;

public class TotalCost {
  
  public static int solve(int i, int max_value, int t, int n, int m, int[][][] dp){
        if(i == n){
          if(t == 0) return 1;
          else return 0;
        }
        
        if(t < 0) return 0;

        if(dp[i][max_value][t] != -1) return dp[i][max_value][t];
        
        else{
          int total_cost = 0;
          for(int num = 1; num <= m; num++){
            if(num > max_value) total_cost = total_cost + solve(i+1, num, t-1, n, m, dp);
            else total_cost = total_cost + solve(i+1, max_value, t, n, m, dp);
          }
        
          dp[i][max_value][t] = total_cost;
          return dp[i][max_value][t];
        }
  }
  
    public static void main(String[] args) {
      
      int n = 2, m = 3, t = 1;
      int first, count = 0;
      int dp[][][] = new int [n][m+1][t+1];
      int i, j, k;
      
      for(i = 0; i < n; i++) for(j = 0; j <= m; j++) for(k = 0; k <= t; k++) dp[i][j][k] = -1;
      
      for(first = 1; first <= m; first++) count = count + solve(1, first, t, n, m, dp);
      
      System.out.print(count);
  }
}