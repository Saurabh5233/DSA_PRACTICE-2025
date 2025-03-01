// package Contest;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int p = sc.nextInt();

            if (k == 0) {
                System.out.println(0);
                continue;
            } 
            if (k < -p * n || k > p * n) {
                System.out.println(-1);
                continue;
            }
            
            System.out.println((int) Math.ceil((double) Math.abs(k) / p));
        }

    }
}
