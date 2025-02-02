// package CodeForces.\Questions;

import java.util.Scanner;



public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String m = sc.nextLine();

        String answer = "";
        for(int i =0 ;i< n.length();i++){
            answer += (n.charAt(i)-'0')^ (m.charAt(i)-'0');
        }
        System.out.println(answer);
        /*
        int nInt = Integer.parseInt(n, 2);
        int mInt = Integer.parseInt(m, 2);

        System.out.println(nInt+" "+ mInt);

        int ans = nInt^mInt;
        String binaryStr = Integer.toBinaryString(ans);
        System.out.println(binaryStr);
        // System.out.println(n^m);*/
    }   

}
