package Others;

import java.util.*;
public class UniqueColors {
    public static void main(String[] args) {
      int limit = 1;
      // int[][] queries = {{1,4},{2,5},{1,3},{3,4}}; //
      // int[][] queries = {{0,1},{1,2},{2,2},{3,4},{4,5}};
      int[][] queries = {{0,1},{0,4},{1,2},{1,5},{1,4}}; // Expected [1,1,2,2,1]
      
      System.out.println(Arrays.toString(queryResults(limit, queries)));
  }
  
  public static int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> ballToColor = new HashMap<>();
        Map<Integer, Integer> colorCount = new HashMap<>();
        int[] result = new int[queries.length];
        int distCols = 0;
        for(int i = 0;i< queries.length;i++){
            int ball = queries[i][0];
            int newColor = queries[i][1];
            
            // logic for "already exists..."
            
            if(ballToColor.containsKey(ball)){
              int oldCol = ballToColor.get(ball);
              colorCount.put(oldCol, colorCount.get(oldCol)-1);
              if(colorCount.get(oldCol) == 0){
                distCols--;
              }
            }
            
            // if new element....
            
            ballToColor.put(ball, newColor);
            colorCount.put(newColor, colorCount.getOrDefault(newColor, 0)+1);
            if(colorCount.get(newColor) == 1){
              distCols++;
            }
            result[i] = distCols;
        }
        return result;
    }
}