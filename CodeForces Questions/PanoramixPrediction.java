import java.util.Scanner;

public class PanoramixPrediction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        int last =0;
        for (int i = n + 1; i <= m; i++) {
            if (isPrime(i)) {
                // System.out.println(i + " is prime");
                last = i;
                count++;
            }
        }

        if (count == 1 && last == m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
    }

    public static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
