// package Contest;

import java.util.Scanner;

// public class Q2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();

//         for (int i = 0; i < t; i++) {
//             int len = sc.nextInt();
//             sc.nextLine();
//             String s = sc.nextLine();
//             int ans =  countSubs(s, 0,"-_-",new StringBuilder());
//             System.out.println(ans);
//         }
//     }

//     public static int countSubs(String s, int i, String tar , StringBuilder potential){
//         if(i == s.length()){
//             if(potential.toString().equals(tar))
//                 return 1;
//             else return 0;
//         }

//         // take 
//         potential.append(s.charAt(i));
//         int take = countSubs(s, i+1, tar, potential);
//         // not take
//         potential.deleteCharAt(potential.length()-1);
//         int notTake = countSubs(s, i+1, tar, potential);

//         return take + notTake;
//     }
// }


public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int len = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            char[] s = str.toCharArray();
            int minus = 0;
            for(char c : s){
                if(c =='-')minus++;
            }
            int underScore = 0;
            for(char c : s){
                if(c =='_')underScore++;
            }

            int maxCount = Math.max(minus, Math.max(minus, underScore));
            System.out.println(maxCount);
        }
    }

    
}
