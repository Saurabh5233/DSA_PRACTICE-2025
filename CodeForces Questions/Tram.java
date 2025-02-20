import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stations [][] = new int[n][2];
        for(int i = 0;i< n;i++){
            stations[i][0] = sc.nextInt(); 
            stations[i][1] = sc.nextInt(); 
        }

        sc.close();
        int maxCapacity = stations[0][1];
        int last = stations[0][1];
        for(int i = 1;i< n;i++){
            last = stations[i][1] + last - stations[i][0];
            maxCapacity = Math.max(maxCapacity, last) ;
        }
        System.out.println(maxCapacity);



    }
}
