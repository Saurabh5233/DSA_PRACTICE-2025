// package Others.BAcktracking;
import java.util.*;

public class RatInAMaze {
  
  
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n, m;
      n = sc.nextInt();
      m = sc.nextInt();
      int[][] rat = new int[n][m];
      rat[0][0] = 1;
      solve(0,0, m,n, rat);
  }
  
  
  public static void solve(int i, int j , int m, int n , int[][] rat){
    // base case:::::
    if(i == n-1 && j == m-1){
      display(rat,n, m);
      return ;
    }
    else{
      // Forward
      if(i <= n-1 && j+1<=m-1){
        rat[i][j+1] = 1;
        solve(i, j+1, m, n, rat);
      }
      
      // Downward.
      if(i+1 <= n-1 && j <=m-1){
        rat[i+1][j] = 1;
        solve(i+1, j, m, n, rat);
      }
      
      // Assign zero...
      
      rat[i][j] = 0;
      
    }
  }
  
  public static void display(int[][] rat, int n, int m){
    for(int i= 0;i< n;i++){
      for(int j = 0;j<m;j++){
        System.out.print(rat[i][j]+ " ");
      }
      System.out.println();
    }
      System.out.println();
  }
}
