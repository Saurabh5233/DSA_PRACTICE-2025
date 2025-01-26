package AlgoMaster.BackTracking;

import java.util.*;

public class GenerateParentheses {
    
}


class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        String answer = "";
        int openCount=0, closeCount=0;
        solve(n, result, answer, openCount, closeCount);
        return result;
    }

    public void solve(int n , List<String> result, String answer, int openCount, int closeCount){
        if(openCount == n && closeCount == n){
            result.add(answer);
            return;
        }
        else
        {
            // adding open brackets..
            if(openCount< n){
                solve(n,result, answer+"(", openCount+1, closeCount);
            }

            // adding close brackets..
            if(openCount > closeCount){
                solve(n, result, answer+")", openCount, closeCount+1);
            }

        }
    }
}
