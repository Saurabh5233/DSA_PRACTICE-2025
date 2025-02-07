import java.util.ArrayList;
import java.util.List;

public class GenerateAllBinaryString {
    
}

class Solution {
    public static List<String> generateBinaryStrings(int n) {
      List<String> result = new ArrayList<>();
      String str = "";
      if(n == 0) return result;
      
      solve(result, str, 0,n);
      return result;
  
    }
    private static void solve(List<String> result, String str, int i, int n){
        if(i == n){
            result.add(str);
            return ;
        }else{
            
                solve(result, str+'0', i+1, n);
            
            
            if(str=="" || str.charAt(i-1) != '1'){
                solve(result, str+'1', i+1, n);
            }
        }
    }
  }
