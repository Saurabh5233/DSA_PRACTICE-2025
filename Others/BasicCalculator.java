package Others;

import java.util.Stack;

public class BasicCalculator {
    
}


class Solution{

    public int calculate(String s){
        int result=0 , currNum = 0, sign = 1;

        Stack<Integer> stack = new Stack<>();

        // start iterating through the given String
        for(int i = 0;i< s.length();i++){
            char ch = s.charAt(i) ;
            
            // handle numeric characters
            if(ch >='0' && ch <='9'){
                currNum = currNum*10+(ch-'0');  // or (ch-48)
                while(i+1 < s.length() && s.charAt(i+1) >='0' && s.charAt(i+1) <= '9'){
                    currNum = currNum*10+ (s.charAt(i+1)-'0');
                    i++;
                }
                result+=sign*currNum;
                currNum = 0;
            } 
            // handle '+' adn '-'
            else if (ch == '+') {
                sign = 1;
            }
            else if(ch == '-'){
                sign = -1;
            }
            //handle '('
            else if(ch == '('){
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            }
            else if(ch == ')'){
                int prevSign = stack.pop();
                result = prevSign*result;
                int prevResult = stack.pop();
                result += prevResult;
            }

        }
        return result;
    }

}
