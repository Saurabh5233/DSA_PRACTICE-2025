import java.util.*;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {
            {'A', 'B', 'C', 'E'}, 
            {'S', 'F', 'C', 'S'}, 
            {'A', 'D', 'E', 'E'}
        };
        String word = "ABCF";
    
        Solution s = new Solution();

        System.out.println(s.exist(board, word));
    }
    
}

class Solution{
    public boolean exist(char[][] board, String word){
        int n = board.length;
        int m = board[0].length;
        int i ,j;

        for(i = 0;i< n;i++){
            for(j = 0;j< m; j++){
                if(solve(i, j, m, n, board, word, 0)) return true;
            }
        }
        return false;
    }
    private boolean solve(int i, int j, int m, int n, char[][] board, String word, int index){
        if(index == word.length())return true;

        else if(i < 0 || j < 0 || j> m-1 || i > n-1 || board[i][j] == '*' || board[i][j] != word.charAt(index)){
            return false;
        }
        else{
            char temp = board[i][j];
            board[i][j] = '*';
            boolean forward = solve(i, j+1, m, n, board, word, index+1);
            boolean backward = solve(i, j-1, m, n, board, word, index+1);
            boolean upward = solve(i-1, j, m, n, board, word, index+1);
            boolean downward = solve(i+1, j, m, n, board, word, index+1);
            board[i][j] = temp;

            return forward || backward || upward || downward ;
        }
    }
}
