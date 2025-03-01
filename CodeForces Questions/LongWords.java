import java.util.Scanner;

public class LongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // String[] words = new String[n];
        for(int i = 0;i<=n;i++){
            String s = sc.nextLine();
            if(s.length() <= 10)System.out.println(s);
            else {
                System.out.println(""+ s.charAt(0)+ (s.length()-2) + s.charAt(s.length()-1));
            }
        }
    }
}
