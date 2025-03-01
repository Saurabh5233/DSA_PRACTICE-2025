import java.util.Arrays;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("");
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        int dist = 1;
        for (int i = 1; i < s.length; i++) {
            if(s[i] != s[i-1])dist++;
        }
        // System.out.println(dist);
        if(dist%2 ==0) System.out.println( "CHAT WITH HER!" );
        else System.out.println( "IGNORE HIM!");
    }
}
