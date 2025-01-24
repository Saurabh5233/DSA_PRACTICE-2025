import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        year++;
        while(!isBeautiful(year) ){
            year++;
        }
        System.out.println(year);
        
    }    
    public static boolean isBeautiful(int n){
        String year = Integer.toString(n);
        boolean flag= true;
        boolean[] seen = new boolean[10];

        for(int i = 0;i< 4;i++){
            int idx = year.charAt(i)-'0';

            if(seen[idx]){
                return false;
            }
            seen[idx] = true;
            
        }
        
        return true;
        
    }
}
