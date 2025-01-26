package AlgoMaster.BackTracking;

import java.util.*;

public class SmallestPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = sc.nextInt();
        }

        System.out.println(smallestElement(n, seq));

    }

    public static int smallestElement(int n, int[] seq) {
        // taking set to avoid duplicate or values in the final result.............
        Set<Integer> result = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        solve(result, list, seq, 0);

        List<Integer> sortedResult = new ArrayList<>(result);
        Collections.sort(sortedResult);

        // Find the smallest missing element from tje sorted result
        int minElement = -1;
        for (int i = 0; i < sortedResult.size() - 1; i++) {
            if (sortedResult.get(i) != sortedResult.get(i + 1) - 1) {
                minElement = sortedResult.get(i) + 1;
                break;
            }
        }

        if (minElement < 0) {
            minElement = sortedResult.get(sortedResult.size() - 1) + 1; // if still negative, take Last element +1
        }

        return minElement;
    }

    public static void solve(Set<Integer> result, List<Integer> list, int[] seq, int i) {
        if (i == seq.length) {
            int or = 0;
            for (int j = 0; j < list.size(); j++) {
                or |= list.get(j);
            }
            result.add(or);
            return;
        } else {
            list.add(seq[i]);
            solve(result, list, seq, i + 1);
            list.remove(list.size() - 1);
            solve(result, list, seq, i + 1);
        }
    }
}