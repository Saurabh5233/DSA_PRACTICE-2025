// package RecursionQuestions;
import java.util.*;
import java.lang.Math;
public class ReverseANumber {
    public static void main(String[] args) {
        int n = 1234654;

        System.out.println(solve(n, 0));
    }
    public static int solve(int n, int rev){
        if(n==0 ){
            return rev;
        }
        return solve(n/10, rev*10+ n%10);
    }
}
