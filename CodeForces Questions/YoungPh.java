import java.util.Scanner;

public class YoungPh{
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int[][] vectors = new int[n][3];

        int col1 = 0, col2= 0, col3 = 0;

        for(int i= 0;i<n;i++){
            
            for(int j = 0;j<3;j++){
                if(j ==0){
                    col1+= sc.nextInt();
                }
                if(j ==1){
                    col1+= sc.nextInt();
                }
                if(j ==2){
                    col1+= sc.nextInt();
                }
            }

        }
        if(col1==0 && col2==0 && col3==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        

    }

}