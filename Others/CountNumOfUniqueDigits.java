package Others;

public class CountNumOfUniqueDigits {
        
}

// we can have 0, 1-digit , 2 digit ..... upto n- digit number in all .
// we need to find the possible unique numbers in all these types and add them up.
// so if n = 0, unique = 0;
// if n = 1, unique = 10;
// for n = 2 , unique = 9+9, coz, tensplace = 9, ones place= 9, at 10's place we dont take 0, and ones place can't have one number equal to that used in 10's place.
// so, further places will keep decresing to 8, 7, ..... in case of further n digit number

class Solution{

    public int countNumbersWithUniqueDigits(int n){
        
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 9;
        }
        else{
            int answer = 10;
            int leftMost = 9;
            int nextLeft = 9;
            // we will start taking from 2nd place from left to further.... upto n. in a n digit num coz the first two are fixed, 9,9;
            for(int i = 2;i<n;i++){
                leftMost *= nextLeft; // 9*9, initially and further 9*8, 9*7 and so on.....

                answer += leftMost;
                nextLeft--; // decreas the next left places...
            }
            return answer;
        }

    }
}
