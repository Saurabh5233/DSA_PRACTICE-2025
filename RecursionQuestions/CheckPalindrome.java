// package RecursionQuestions;

public class CheckPalindrome {
    public static void main(String[] args) {
        String s = "malayalam";
        System.out.println(solve(s, 0, s.length()-1));
    }

    public static boolean solve(String s, int i, int j){
        if(i > j){
            return true;
        }else if(s.charAt(i)!= s.charAt(j)){
            return false;
        }
        else{
            return solve(s, i+1, j-1);
        }
    }
}
