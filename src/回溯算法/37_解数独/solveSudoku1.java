public class solveSudoku1 {
    public void solveSudoku(char[][] board) {
        backtracking(board);
    }
    
    public boolean backtracking(char[][]board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    continue;
                }
                for(char k='1';k<'9';k++){
                    if(isValid(i,j,k,board)){
                        board[i][j] = k;
                        if(backtracking(board)){
                            return true;
                        }
                        board[i][j]='.';
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean isValid(int row, int col, char val, char[][] board) {
        for(int i = 0;i<9;i++){
            if(board[row][i]==val){
                return false;
            }
        }
        for(int j = 0;j<9;j++){
            if(board[j][col]==val){
                return false;
            }
        }
        int start1 =(row/3)*3;
        int start2 =(col/3)*3;
        for(int i=start1;i<start1+3;i++){
            for(int j=start2;j<start2+3;j++){
                if(board[j][col]==val){
                    return false;
                }
            }
        }
        return true;
    }
    
}
