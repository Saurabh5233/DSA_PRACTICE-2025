import java.util.Scanner;

public class WordCapitalization {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder newS = new StringBuilder(s);
        if ((int)(s.charAt(0))>= 65 && (int)(s.charAt(0)) <=90) {
            System.out.println(s);
        }else{
            newS.setCharAt(0,(char)(s.charAt(0)-32));
            System.out.println(newS.toString());
        }
        
    }
}