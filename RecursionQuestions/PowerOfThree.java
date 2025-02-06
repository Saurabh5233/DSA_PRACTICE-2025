public class PowerOfThree {
    /*Given an integer n, return true if it is a power of three. Otherwise, return false.
An integer n is a power of three, if there exists an integer x such that n == 3x. */
    public static void main(String[] args) {
        int n = 19682;
        if(n <=0){
            System.out.println(false);
            return;
        }
        System.out.println(solve(n));
    }
    public static boolean solve(int n){
        if(n == 1){
            return true;
        }else if(n ==  0){
            return false;
        }
        if(n %3 !=0){
            return false;
        }
        return solve(n/3);
    }
}
