package Others.HomeWorks;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/*
public class GlideTyping {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        


        // String s =  "hgferyjkllkop" ;
        // String s =  "ocbms" ;
        String s =  "zafqz" ;

        // String[] dictionary = {"coffee", "coding", "happy", "hello", "hop"};
        // String[] dictionary = {"rdnothix", "obns", "qhlrpiaiv", "ms", "jaupx"};
        String[] dictionary = {"divuyaufa", "gtsbe", "hbckuhyh"};

        
        ArrayList<String> PotentialStrings = new ArrayList<>();
        for(String str : dictionary){
            if(isLCS(s, str)){
                PotentialStrings.add(str);
            }
        }
        if(PotentialStrings.size() !=0){
            Collections.sort(PotentialStrings, Comparator.comparingInt(String::length));
            System.out.println(PotentialStrings.get(0));
        }else{
            System.out.println(-1);
        }

        
    }



    public static boolean isLCS(String s, String str){
        if(str.length() == longestCommonSubsequence(s, str)){
            return true;
        }else {
            return false;
        }
    }


    public static int longestCommonSubsequence(String text1, String text2) {
        int rows = text1.length();
        int cols = text2.length();
        int[][] dp = new int[rows+1][cols+1];  // lengths are increased by 1 to include the hypothetical -1 idx
        for(int i = 0;i<rows+1;i++ ){
            for(int j = 0;j< cols+1;j++){
                if(i == 0 || j == 0){ // if making the  zeroth row and colum zero, to ensure out of bound for the strings... 
                    dp[i][j] =0;
                }
                else if(text1.charAt(i-1) == text2.charAt(j-1)){ // the i-1 and j-1 indexes of the texts are corresponding to the ith and jth indexes of the dp table..
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }

            }
        }
        return dp[rows][cols];
    }
}

*/



import java.util.Scanner;

public class GlideTyping {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        
        // String s =  "hgferyjkllkop" ;
        // String s =  "ocbms" ;
        String s =  "zafqz" ;

        // String[] dictionary = {"coffee", "coding", "happy", "hello", "hop"};
        // String[] dictionary = {"rdnothix", "obns", "qhlrpiaiv", "ms", "jaupx"};
        String[] dictionary = {"divuyaufa", "gtsbe", "hbckuhyh"};

        String shortestSubsequence = null;
        for(String str : dictionary){
            if(str.length() > s.length()) continue; // Early exit if str is longer than s
            if(isSubsequence(s, str)){
                if(shortestSubsequence == null || str.length() < shortestSubsequence.length()){
                    shortestSubsequence = str;
                }
            }
        }
        
        if(shortestSubsequence != null){
            System.out.println(shortestSubsequence);
        }else{
            System.out.println(-1);
        }
    }

    public static boolean isSubsequence(String s, String str){
        int i = 0, j = 0;
        while(i < s.length() && j < str.length()){
            if(s.charAt(i) == str.charAt(j)){
                j++;
            }
            i++;
        }
        return j == str.length();
    }
}
