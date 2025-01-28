package Others.HomeWorks;

import java.util.Scanner;

public class Colors01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder colors = new StringBuilder(str);
        int countTime = 0;
        while (true) {
            boolean swapped = false;
            for(int i = 1;i< colors.length();i++){
                if(colors.charAt(i-1) == '0' && colors.charAt(i)== '1'){
                    colors.setCharAt(i-1, '1');
                    colors.setCharAt(i, '0');
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
            countTime++;
        }
        System.out.println(colors);
        System.out.println(" answer : " + countTime);
    }
}
