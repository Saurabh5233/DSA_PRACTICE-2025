import java.util.Scanner;

public class Insomnia_Cure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();

        int harmed = 0;
        for(int i= 1;i <= d;i++){
            if(i%k == 0 || i%l ==0 || i%m ==0 || i%n == 0){
                harmed+=1;
            }
        }
        System.out.println(harmed);
    }
}
