// package CodeForces Questions;

import java.util.Arrays;
import java.util.Scanner;



public class ArrivalOfGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] soldiers = new int[n];

        int maxIdx = -1,minIdx = -1, count = 0 ;
        
        int maxHt = Integer.MIN_VALUE, minHt = Integer.MAX_VALUE;
        
        for (int i = 0; i < soldiers.length; i++) {
            soldiers[i] = sc.nextInt();


            if(soldiers[i] > maxHt){
                maxHt = soldiers[i];
                maxIdx = i;
            }
            if(soldiers[i] <= minHt){
                minHt = soldiers[i];
                minIdx = i;
            }
        }

        System.out.println("maxHt: "+ maxHt+" , minHt: "+minHt);

        count = maxIdx + (n -1- minIdx);

        if(maxIdx > minIdx) count--;

        System.out.println(count);
        
    }
}
