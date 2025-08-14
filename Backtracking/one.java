package backtracking;

public class one {
    
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
    public static boolean cou(char board[][],int i){
        if(i==board.length){
           
            return true;
        }
        for(int j=0;j<board.length;j++){
            if(check(board, i, j)){//checking the surrounding
            board[i][j]='Q';
            if(cou(board, i+1)){
                return true;
            }
            board[i][j]='x';//backtracking
            }
        }
        return false;
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
        int n=6;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        if(cou(board, 0)){
            printarr(board);
        }
        else{
        System.out.println("The total no ways");
        }
    }
}
