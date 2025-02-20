import java.util.Scanner;

public class Cupboards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int[][] cupb = new int[n][2];

        int leftOpen = 0, leftClose = 0, rightOpen = 0, rightClose = 0;
        for(int i = 0;i< n;i++){
            // for the left side...
            if(sc.nextInt() == 0) leftClose++;
            else leftOpen++;
            if(sc.nextInt() == 0) rightClose++;
            else rightOpen++;
        }
        System.out.println(Math.min(leftOpen, leftClose) + Math.min(rightClose, rightOpen));
    }
}
