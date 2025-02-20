import java.util.Scanner;

public class ContestScores {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int scores[] = new int[n];
        
        for(int i = 0;i< n;i++){
            scores[i] = sc.nextInt();
        }
        int maxScore = scores[0];
        int minScore = scores[0];
        int amazing = 0;
        for(int i = 1;i< n;i++){
            if(scores[i] <= maxScore && scores[i] >= minScore)continue;

            if(scores[i] < minScore) minScore = scores[i];
            if(scores[i] > maxScore) maxScore = scores[i];
            amazing++;
        }
        System.out.println(amazing);

    }
}
