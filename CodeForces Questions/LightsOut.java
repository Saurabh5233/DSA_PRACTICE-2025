import java.util.Scanner;

public class LightsOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] initialLights = new boolean[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                initialLights[i][j] = true;
            }
        }


        int[][] pressed = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                pressed[i][j] = sc.nextInt()%2;

                if(pressed[i][j] == 1){

                    initialLights[i][j] = !initialLights[i][j];
                    if(j!=2)initialLights[i][j+1] = !initialLights[i][j+1];
                    if(i!=2)initialLights[i+1][j] = !initialLights[i+1][j];
                    if(i!=0)initialLights[i-1][j] = !initialLights[i-1][j];
                    if(j!=0)initialLights[i][j-1] = !initialLights[i][j-1];

                }
            }
        }

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (initialLights[i][j]) {
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }

        
    }

}
