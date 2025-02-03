// package RecursionQuestions;

public class SumAndProductDigits {
    public static void main(String[] args) {
        int n = 234510;
        // System.out.println(solve(n, 0));      gives sum
        System.out.println(solve(n, 1));
    }

    //product
    public static int solve(int n , int prod){
        if(n == 0){
            return prod;
        }
        prod *= n%10;
        return solve(n/10,prod);
    }

    //sum
    // public static int solve(int n , int sum){
    //     if(n == 0){
    //         return sum;
    //     }
    //     sum += n%10;
    //     return solve(n/10,sum);
    // }
}
