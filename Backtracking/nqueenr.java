package backtracking;

public class nqueenr{
    public static boolean safe(char board[][],int row, int col){
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
    public static void nqr(char board[][], int row){
       if(row==board.length){
        printarr(board);
        return;
       }
       for(int j=0;j<board[0].length;j++){
        if(safe(board, row, j)){
            board[row][j]='Q';
            nqr(board, row+1);//recursive call
            board[row][j]='x';
        }
       }
    }
    public static void printarr(char board[][]) {
        System.err.println("---------chess-----------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.err.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
    }
    nqr(board, 0);
    }
}
