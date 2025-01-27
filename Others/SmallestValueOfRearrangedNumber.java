package Others;

public class SmallestValueOfRearrangedNumber {
    
}


class Solution{

    public long smallestNumber(long num){

        boolean sign = num >=0;
        num = Math.abs(num);
        long[] hash = new long[10];
        long temp = num;
        // fill the hash array
        while(temp != 0){
            hash[(int)(temp%10)]++;
            temp /=10;
        }
        long answer = 0;
        if(sign){
            // start from the nonzero index and fill the 1st instance once and then fill all the zeroes...
            for(int i = 1;i< 10;i++){
                if(hash[i] != 0){
                    answer = i;
                    hash[i]--;
                    while(hash[0]!=0){
                        answer = answer*10;
                        hash[0]--;
                    }
                    break;
                }

            }
            // now the 1st number once and all zeroes are placed , add the furter nums
            for(int i = 0;i< 10;i++){
                while(hash[i] != 0){
                    answer = answer*10 + i;
                    hash[i]--;
                }
            }
        }
        else{

            for(int i = 9;i>=0;i--){
                while (hash[i] !=0) {
                    answer = answer*10+i;
                    hash[i]--;
                }
            }
            answer = -answer;
        }

        return answer;
    }

}