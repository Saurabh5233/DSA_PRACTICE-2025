package Others.HomeWorks;

import java.util.Scanner;

public class colors01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String colors = sc.nextLine();
        int countTime = 0;
        StringBuilder correctOrder = new StringBuilder(colors);

        int i= 0, j = correctOrder.length()-1;
        while (i< j) {
            if(correctOrder.charAt(i) == '0' && correctOrder.charAt(j) == '1'){
                char temp = correctOrder.charAt(j);
                correctOrder.setCharAt(j, correctOrder.charAt(i));
                correctOrder.setCharAt(i, temp);
                countTime++;
                
            }
            else if(correctOrder.charAt(i) == '0'){
                j--;
            }
            else if(correctOrder.charAt(i) == '0'){
                j--;
            }
            i++;
            j--;
        }
        System.out.println(correctOrder);
        System.out.println(" answer : " + countTime*2);
    }
}
