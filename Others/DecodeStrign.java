package Others;

import java.util.Stack;

public class DecodeStrign {
    
}




class Solution {
    public String decodeString(String s) {
        String res = "";
        Stack<String> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        StringBuilder currStr = new StringBuilder();
        int curr = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // to handle numeric chars
            if (ch >= '0' && ch <= '9') {
                curr = curr * 10 + (ch - '0');
                
            }
            // handle '['
            else if(ch == '['){
                numStack.push(curr);
                strStack.push(currStr.toString());
                curr = 0;
                currStr = new StringBuilder();
            }
            //handle a to z
            else if(ch >= 'a' && ch <= 'z'){
                currStr.append(ch);
            }
            // handle ']'
            else if (ch == ']') {
                StringBuilder temp = new StringBuilder(strStack.pop());
                int repeatTimes = numStack.pop();
                for (int j = 0; j < repeatTimes; j++) {
                    temp.append(currStr);
                }
                currStr = temp;
            }

        }
        res = currStr.toString();
        return res;
    }
}
