package backtracking;

public class count {
    static int co=0; 
    public static boolean check(char board[][],int row,int col){
         //vertical up
         for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // left dia
        for(int i=row-1,j=col-1; i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //right dia
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;

        
    }
    public static void cou(char board[][],int i){
        if(i==board.length){
            co++;//counting the no of ways
            return;
        }
        for(int j=0;j<board.length;j++){
            if(check(board, i, j)){//checking the surrounding
            board[i][j]='Q';
            cou(board, i+1);//recursive call
            board[i][j]='x';//backtracking
            }
        }
    }
    public static void main(String[] args) {
        int n=5;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        cou(board, 0);
        System.out.println("The total no of ways : "+co);
    }
}
