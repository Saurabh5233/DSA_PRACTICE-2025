import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int count=0;
        while ( num!= 0) {
            long a = num%10;
            if (a == 7 || a== 4) {
                count++ ;
            }
            num /= 10;
        }

        if (count == 7 || count == 4) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
