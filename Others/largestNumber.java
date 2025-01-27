package Others;

import java.util.*;

public class largestNumber {
    
}


class Solution{
    public String largestNumber(int[] nums){
        String[] strNum = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNum[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(strNum,(a,b)->{
            String ab = a.toString()+b.toString();
            String ba = b.toString()+a.toString();

            return ba.compareTo(ab);
        } );
        if(strNum[0].equals("0")){
            return "0";
        }
        
        String answer = "";
        for(String s : strNum){
            answer+= s;
        }
        return answer;
    }
}
