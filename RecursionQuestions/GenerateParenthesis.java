import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
        int n = 2;
        generateParenthesis(n);
    }

    public static void generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        String ans = "";

        solve(res, ans, n, 0, 0);  // 0, 0 for open and close counts.
        System.out.println(res);
    }

    public static void solve(List<String> res, String ans, int n, int op , int cl){
        if(op == n && cl == n){
            res.add(ans);
            return ;
        }
        if(op < n){
            // ans+= '(';
            solve(res, ans+'(', n, op+1, cl);
        }
        if(op > cl){
            // ans += ')';
            solve(res, ans+')', n, op, cl+1);
        }
        
    }
}
