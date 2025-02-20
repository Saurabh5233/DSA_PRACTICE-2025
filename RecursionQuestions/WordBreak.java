import java.util.*;
public class WordBreak {
    public static void main(String[] args) {
        List<String> wordDict = new ArrayList<>();

        // String s = "catsandog";
        // wordDict.add("cats");
        // wordDict.add("dog");
        // wordDict.add("sand");
        // wordDict.add("and");
        // wordDict.add("cat");

        String s = "applepenapple";
        wordDict.add("apple");
        wordDict.add("pen");

        Solution sol = new Solution();
        System.out.println(sol.wordBreak(s, wordDict));
    }
}

// Recursion approach....
/*
class Solution{

    public boolean wordBreak(String s, List<String> wordDict) {
        return solve(s, wordDict, 0);
    }
    private boolean solve(String s, List<String> wordDict, int i){
        if(i == s.length()) return true;

        for(int j = i+1;j<= s.length();j++){
            if(wordDict.contains(s.substring(i, j))){
                return solve(s, wordDict, j);
            }
        }
        return false;
    }
}

*/

// Memoization...

/*
class Solution{
    Boolean found[];
    public boolean wordBreak(String s, List<String> wordDict) {
        found = new Boolean[s.length()];
        return solve(s, new HashSet<String>(wordDict), 0);
    }
    private boolean solve(String s, Set<String> wordDict, int i){
        if(i == s.length()) return true;
        if(found[i] != null) return found[i];
        for(int j = i+1;j<= s.length();j++){
            if(wordDict.contains(s.substring(i, j)) && solve(s, wordDict, j)){
                return found[i] = true;
            }
        }
        return found[i] = false;
    }
}

*/

// Tabulation
class Solution{
    
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        boolean[] found = new boolean[s.length()+1];
        found[0] = true;   // for empty strings, they are always breakable....


        for(int i = 1;i<= s.length();i++){
            for(int j = 0;j<i;j++){
                
                if(found[j] &&wordSet.contains(s.substring(j, i))){
                    found[i] = true;
                    break;
                }
            }
        }


        return  found[s.length()];
    }
    
}

