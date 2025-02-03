// package RecursionQuestions;

public class StringLength {
    public static void main(String[] args) {
        String s = "qwerty";

        System.out.println(solve(s,0));
    }
    public static int solve(String s, int i){
        try{
            s.charAt(i);
            return solve(s, i+1);
        }catch (StringIndexOutOfBoundsException e){
            return i;
        }
    }
}
