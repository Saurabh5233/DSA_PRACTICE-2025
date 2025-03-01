import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] nums = s.split("\\+");
        Arrays.sort(nums);
        String ans = String.join( "+", nums);
        System.out.println(ans);
        // System.out.println(Arrays.toString(nums));
    }
}
