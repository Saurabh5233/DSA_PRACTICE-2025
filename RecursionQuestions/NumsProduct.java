// package RecursionQuestions;

public class NumsProduct {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        System.out.println(solve(a,b,0));
    }
    public static int solve(int a, int b , int prod){
        if(b == 0){
            return prod;
        }
        prod += a;
        return solve(a, b-1, prod);
    }
}
