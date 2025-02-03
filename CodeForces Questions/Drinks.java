import java.util.Scanner;

public class Drinks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] drinks = new int[n];
        double sum = 0;
        for(int i: drinks){
            i = sc.nextInt();
            sum+= i;
        }
        System.out.println(sum/n);


    }
}
