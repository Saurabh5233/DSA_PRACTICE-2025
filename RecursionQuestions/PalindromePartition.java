import java.util.*;

public class PalindromePartition {
    public static void main(String[] args) {
      Solution sol = new Solution();
      
      String s = "aab";
      System.out.println(sol.partition(s));
  }
}


class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> list= new ArrayList<>();

        StringBuilder str = new StringBuilder();

        solve(result ,list,s, 0);
        return result;
    }

    private void solve(List<List<String>> result, List<String> list, String s, int i){
        if(i == s.length()){
            result.add(new ArrayList<>(list));
            return;
        }else{
            for(int j = i;j<s.length();j++){
              if(isPalindrome(s, i, j)){
                list.add(s.substring(i,j+1));
                solve(result, list, s, j+1);
                list.remove(list.size()-1);
              }
              
            }
        }
    }
    
    private boolean isPalindrome(String s, int start, int end){
      while(start <= end){
        if(s.charAt(start++) != s.charAt(end--)){
          return false;
        }
      }
      return true;
    }
}