package AlgoMaster.BackTracking;
import java.util.*;

public class LetterCombinartion {
    // write the driver code.....
}

class Solution{
    public List<String> letterCombinations(String digits){
        List<String> result = new ArrayList<>();
        HashMap<Character, String> keypad = new HashMap<>();
        keypad.put('2',"abc");
        keypad.put('3',"def");
        keypad.put('4',"ghi");
        keypad.put('5',"jkl");
        keypad.put('6',"mno");
        keypad.put('7',"pqrs");
        keypad.put('8',"tuv");
        keypad.put('9',"wxyz");
        String answer = "";
        solve(digits, result, answer,keypad, 0);
        return result;
    }
    public void solve(String digits, List<String> result, String answer,HashMap<Character, String> keypad, int i){
        if(i == digits.length()){
            result.add(answer);
            return;
        }else{


            String letters = keypad.get(digits.charAt(i));
            for(int j = 0;j< letters.length();j++){
                solve(digits, result, answer+letters.charAt(j), keypad, i+1);
            }
        }
    }

}
