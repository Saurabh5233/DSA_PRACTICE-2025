package Others.DP;

import java.util.*;
// find the nth fibonacci term....... 0 1 1 2 3 5 8.....
// if n = 6
/*
public class Fibonacci {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int[] dp = new int[n+1];
      Arrays.fill(dp, -1);
      System.out.println(fib(n, dp));
  }
  public static int fib(int n, int[] dp){
    if(n == 0 || n== 1){
      
      return n;
    }
    if(dp[n] != -1){
      return dp[n];
    }
    dp[n] =fib(n-2, dp) + fib(n-1, dp);
    return dp[n];
  }
}

*/

public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] dp = new int[n + 1];
    dp[0] = 0;
    dp[1] = 1;
    for (int i = 2; i <= n; i++) {
      dp[i] = dp[i-2] + dp[i-1];
    }
    System.out.println(dp[n]);
  }

}