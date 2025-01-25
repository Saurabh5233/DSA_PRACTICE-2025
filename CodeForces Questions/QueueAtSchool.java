import java.util.Scanner;

public class QueueAtSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        sc.nextLine();

        String a = sc.nextLine();
        StringBuilder str = new StringBuilder(a);
        // System.out.println(str);
        while(t>0){
            for(int i = str.length()-1;i>0;i--){
                if(str.charAt(i) == 'G' && str.charAt(i-1) == 'B'){
                    char temp = str.charAt(i);
                    str.setCharAt(i,str.charAt(i-1)) ;
                    str.setCharAt(i-1,temp) ;
                  i--;
                }
            }
            t--;
        }
        System.out.println(str.toString());
        sc.close();

    }
}
