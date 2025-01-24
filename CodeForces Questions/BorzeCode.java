import java.util.Scanner;

public class BorzeCode {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String code = sc.nextLine();
        String ans = "";
        for(int i =0;i<code.length();i++){
            if(code.charAt(i) == '.'){
                ans+= '0';
            }else if(code.charAt(i)=='-'){
                if(code.charAt(i+1) == '.'){
                    ans+= '1';
                }else if(code.charAt(i+1) == '-'){
                    ans+='2';
                }
                i++;
            }
        }
        System.out.println(ans);
    }
}
