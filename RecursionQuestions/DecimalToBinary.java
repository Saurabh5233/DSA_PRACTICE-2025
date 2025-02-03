// package RecursionQuestions;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 120;

        System.out.println(solve(n));
    }
    public static int solve(int n){
        if(n == 1){
            return 1;
        }
        return 10*solve(n/2)+n%2;
    }
}
