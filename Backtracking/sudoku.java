package backtracking;

public class sudoku {
    public static boolean safe(int sud[][],int row,int col,int digit){
        //right left
        for(int j=col;j<8;j++){
            if(sud[row][j]==digit){
                return false;
            }
        }
        for(int i=row;i<8;i++){
            if(sud[i][col]==digit){
                return false;
            }
        }
        int sr=(row/3)*3;
        int cr=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=cr;j<cr+3;j++){
                if(sud[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean su(int sud[][], int row,int col){
        if(row==9){//base case
            return true;
        }
        int nextRow=row;
        int nextCol=col+1;
        if(nextCol==9){
            nextRow=row+1;
            nextCol=0;
        }
        if(sud[row][col]!=0){
            return su(sud, nextRow, nextCol);
        }
        for(int digit=1;digit<=9;digit++){
            if(safe(sud,row,col,digit)){
                sud[row][col]=digit;
                if(su(sud, nextRow, nextCol)){
                    return true;
                }
                sud[row][col]=0;
            }
        }
        return false;
    }
    public static void printSud(int sud[][]){
        for(int i=0;i<sud.length;i++){
            for(int j=0;j<sud.length;j++){
                System.out.print(sud[i][j]+" ");
            }
            System.err.println();
        }
    }
    public static void main(String[] args) {
        int sud[][]={ 
        {0, 0, 8, 0, 0, 0, 0, 0, 0},
        {4, 9, 0, 1, 5, 7, 0, 0, 2},
        {0, 0, 3, 0, 0, 4, 1, 9, 0},
        {1, 8, 5, 0, 6, 0, 0, 2, 0},
        {0, 0, 0, 0, 2, 0, 0, 6,0},       
        {9, 6, 0, 4, 0, 5, 3, 0, 0},
        {0, 3, 0, 0, 7, 2, 0, 0, 4},
        {0, 4, 9, 0, 3, 0, 0, 5, 7},
        {8, 2, 7, 0, 0, 9, 0, 1, 3}};
        if(su(sud, 0, 0)){
            System.out.println("Suduko is possible");
        printSud(sud);
        }
        else{
            System.out.println("Not possible");
        }
    }
    
}
