public class PowerOfTwo {

    /*Given an integer n, return true if it is a power of two. Otherwise, return false. An integer n is a power of two, if there exists an integer x such that n == 2x */
    public static void main(String[] args) {
        int n = 3;
        if(n <= 0){
            System.out.println(false);
            return ;
        }
        System.out.println(solve(n, 0));
    }
    public static boolean solve(int n , int rem){
        if(n == 1 && rem!= 0){
            return false;
        }
        if(n== 1 && rem == 0){
            return true;
        }
        rem += n%2;
        return solve(n/2, rem);
    }
}
