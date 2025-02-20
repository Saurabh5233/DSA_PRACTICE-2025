import java.util.*;

import BinaryTrees.Solution;


public class KthPermutation {
    public static void main(String[] args) {
        int n = 8;
        int k = 9;
        Solution sol = new Solution();

        System.out.println(sol.getPermutation(n, k));
    }
}


class Solution {
    public String getPermutation(int n, int k) {
        // List<String> result = new ArrayList<>();

        
        String up = "";
        for(int i= 1;i<=n;i++){
        up+= i;
        }
        String result = solve("", up, k);
        // Collections.sort(result);
        // System.out.println(result);
        // return result.get(k-1);
        return result;
    }

    private String solve(String p, String up, int k){
        if(up.length() == 0 && k == 0){
            return p;
        }

        // List<String> list = new ArrayList<>();
        String ans = "";
        char ch = up.charAt(0);
        for(int i = 0;i<= p.length();i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans
            ans = solve(f + ch + s, up.substring(1), k-1);
        }
        return ans;
    }
}
