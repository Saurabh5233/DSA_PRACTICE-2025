/*

package Others.HomeWorks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MiddleSubseq {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // List<Integer>  seq = new ArrayList<>();
        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            // seq.add(sc.nextInt());
            seq[i] = sc.nextInt();
        }

        System.out.println(findMiddleValue(seq));
    }
    public static int findMiddleValue(int[]  seq){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        solve(result, list, seq, 0);
        int minSum = Integer.MAX_VALUE;
        for(List<Integer> l: result){
            minSum = Math.min(minSum, l.get(0)+l.get(1)+l.get(2));
        }
        return minSum;
    }


    public static void solve(List<List<Integer>> result, List<Integer> list, int[] seq, int i ){
        if(list.size()== 3){
            if(list.get(0) < list.get(1) && list.get(1) > list.get(2)){
                result.add(new ArrayList<>(list));
            }
            return;
        }
        if(i >=seq.length){
            return;
        }

        list.add(seq[i]);
        solve(result, list, seq, i+1);
        list.remove(list.size()-1);
        solve(result, list, seq, i+1);

    }

}



*/




///////////////////////////////////////////////////////////////////////////////
package Others.HomeWorks;

import java.util.Scanner;

public class MiddleSubseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = sc.nextInt();
        }

        System.out.println(findMiddleValue(seq));
    }

    public static int findMiddleValue(int[] seq) {
        int n = seq.length;
        if (n < 3) {
            return -1; // Not possible to form a subsequence of size 3
        }

        int leftMin = Integer.MAX_VALUE;
        int middleMax = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (seq[i] > middleMax) {
                // Update the middleMax if seq[i] is valid
                middleMax = seq[i];
            } else if (seq[i] < middleMax && seq[i] > leftMin) {
                // Calculate the sum of the valid subsequence
                minSum = Math.min(minSum, leftMin + seq[i] + middleMax);
            }

            // Update the smallest element so far
            leftMin = Math.min(leftMin, seq[i]);
        }

        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}
