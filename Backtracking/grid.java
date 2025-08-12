package backtracking;

public class grid {
    public static int gridd(int i,int j,int n,int m){
        if(i==n-1 && j==m-1){
            return 1;
        }
        else if(i==n||j==m){
            return 0;
        }
        int w1=gridd(i+1, j, n, m);
        int w2=gridd(i, j+1, n, m);
        return w1+w2;
    }
    public static void main(String[] args) {
        int tw=gridd(0, 0, 3, 3);
        System.out.println("Total no of ways"+tw);
    }
}
