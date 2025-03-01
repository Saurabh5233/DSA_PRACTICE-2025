import java.util.Arrays;
import java.util.Scanner;

public class HorseShoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] colors = new int[4];
        colors[0] = sc.nextInt();
        int distinct  = 1;
        for(int i =1;i<4;i++){
            colors[i] = sc.nextInt();
        }
        Arrays.sort(colors);
        
        for (int i = 1; i < colors.length; i++) {
            
            if(colors[i]!= colors[i-1])distinct++;
        }
        System.out.println(4-distinct);
    }
}
