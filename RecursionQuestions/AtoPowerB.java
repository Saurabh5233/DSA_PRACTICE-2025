// package RecursionQuestions;

public class AtoPowerB {
    public static void main(String[] args) {
        double a = 4;
        int b = -1;
        if(b == 0){
            System.out.println(1);
            return;
        }
        else if(b == 1){
            System.out.println(a);
            return;
        }
        if(b<0){
            a = 1/a;
            b = -b;
        }

        System.out.println(solve(a,b));
    }
    public static double solve(double a, int b){
        if(b == 0){
            return 1;
        }
        double half = solve(a, b/2);
        
        //even 'b'
        if(b%2 == 0){
            return half* half;
        }else{
            return half* half* a;
        }
    }
}
