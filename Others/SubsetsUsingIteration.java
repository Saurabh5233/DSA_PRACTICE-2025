// package Others;

import java.util.*;

public class SubsetsUsingIteration {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        List<List<Integer>> answer = subset(arr);
        System.out.println(answer);
        // for(List<Integer> list : answer){
        //     System.out.println(list);
        // }
    }
    
    // private static List<List<Integer>> subset(int[] arr){
    //     List<List<Integer>> outer = new ArrayList<>();
    //     outer.add(new ArrayList<>());
    //     for(Integer num: arr){
    //         int len = outer.size();
    //         for (int i = 0; i < len; i++) {
    //             List<Integer> inner = new ArrayList<>(outer.get(i));
    //             inner.add(num);
    //             outer.add(inner);
    //         }
    //     }
    //     return outer;
        
    // }

    // in case of duplicates
    private static List<List<Integer>> subset(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0, end = 0;

        for(int j = 0;j< arr.length;j++){
            int len = outer.size();
            if(j > 0 && arr[j] == arr[j-1]){
                start = end+1;
            }
            end = outer.size()-1;
            for (int i = start; i < len; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(arr[j]);
                outer.add(inner);
            }
        }
        return outer;
        
    }
}
