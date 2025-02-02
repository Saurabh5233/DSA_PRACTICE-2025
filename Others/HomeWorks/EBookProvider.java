package Others.HomeWorks;

import java.util.Scanner;

public class EBookProvider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        // int n = sc.nextInt();
        int n= 3;
        // int[] iv = {2,4,4,5};
        // int[] articles = {2,2,3,4};
        int[] iv = {3,2,2};
        int[] articles = {3,2,2};
        // int[] iv = new int[n];
        // int[] articles = new int[n];
        int p  = 9;

        System.out.println(solve(iv,articles,0,p));

    }

    public static int solve(int[] iv, int[] articles, int i, int p){
        if(i == iv.length || p == 0){
            return 0;
        }

        if(articles[i] > p){
            return solve(iv, articles, i+1, p);
        }
        else{

            // take or not take......
            // probably read it again
            int read =  iv[i] + solve(iv, articles, i+1, p-(articles[i]));
                
            int notRead  = solve(iv, articles, i+1, p);
            return Math.max(read, notRead);
        }
    }
}



