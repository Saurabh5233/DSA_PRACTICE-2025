import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        // solve("", "abc");
        ArrayList<String> answer = solve("", "abc");
        System.out.println(answer);
    }/*
    private static void solve(String p, String up){
        if(up == ""){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for(int i = 0;i<= p.length();i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            solve(f+ch+s, up.substring(1));
        }
    }
    */
    
    private static ArrayList<String> solve(String p, String up){
        if(up == ""){
            ArrayList<String> answer = new ArrayList<>();
            answer.add(p);
            return answer;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for(int i = 0;i<= p.length();i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(solve(f+ch+s, up.substring(1)));
        }
        return ans;
    }
}
