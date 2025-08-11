package backtracking;

public class nx2 {
    
    public static void q(char board[][],int i){
        //base
        if(i==board.length){
              printb(board);
              return;
        }
        //recursive
        for(int j=0;j<board.length;j++){
            board[i][j]='Q';
            q(board, i+1);//recursive call
            board[i][j]='.';//bactracking step
        }
    }
    public static void printb(char board[][]){
        System.err.println("---------chess-----------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.err.println();
        }
    }
    public static void main(String[] args) {
        int n=2;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
    }
    q(board, 0);
}
}
