import java.util.Scanner;

public class PerfectPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 != 0) {
            System.out.println(-1);
            return;
        }

        int[] permut = new int[n];
        for(int i = 0;i<n;i++){
            permut[i] = i+1;

        }

        int i = 1;
        while(i < permut.length){
            permut[i] = permut[i]^permut[i-1];
            permut[i-1] = permut[i]^permut[i-1];
            permut[i] = permut[i]^permut[i-1];
            i+=2;
        }
        for(int j: permut){
            System.out.print(j+ " ");
        }

    }
}
