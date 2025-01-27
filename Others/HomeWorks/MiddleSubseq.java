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


