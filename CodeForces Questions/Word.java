import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int capCount = 0;
        int smallCount = 0;
        StringBuilder ans = new StringBuilder(s);
        for(int i = 0;i<s.length();i++){
            Character c = s.charAt(i);
            if((int)c >=65 && (int)c <=90){
                //Capital character...
                capCount++;
            }else{
                smallCount++;
            }
        }

        if(smallCount > capCount || smallCount == capCount){
            for (int i = 0; i < ans.length(); i++) {
                Character c = s.charAt(i);
                if((int)c >=65 && (int)c <=90){
                    //Capital character...
                    ans.setCharAt(i, (char)((int)c +32));
                }
            }
        }
        else{
            for (int i = 0; i < ans.length(); i++) {
                Character c = s.charAt(i);
                if((int)c >=97 && (int)c <=122){
                    //Small letters.......
                    ans.setCharAt(i, (char)((int)c -32));
                }
            }
            
        }
        sc.close();

        System.out.println(ans.toString());


    }
}
