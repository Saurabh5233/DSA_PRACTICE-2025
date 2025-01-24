import java.util.*;

public class BeautifulMatrix {
    public static void main(String[] args) {
        int[][]  matrix = new int[5][5];
        int[] idx = new int[2];
        int tar = 2;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] == 1) {
                    idx[0] = i;
                    idx[1] = j;
                }
            }
        }
        // System.err.println(Arrays.toString(idx));
        int count = Math.abs(idx[0]-tar);
        count+= Math.abs(idx[1]-tar);
        System.out.println(count);
        // System.out.println(Arrays.toString(matrix[1]));
    }

}
