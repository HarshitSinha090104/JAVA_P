package array;
import java.util.*;
public class maxsuarray {

    public static int mxsum(int numbers[]){
        int crs=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++)
        {

            for(int j=i;j<numbers.length;j++)
            {
                 crs=0;
                for(int k=i;k<=j;k++)
                {
                      crs+=numbers[k];
                }
                if(crs>maxsum)
                {
                    maxsum=crs;
                }
            }
 
        }
        return maxsum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numbers[]=new int[5];
        for(int i=0;i<5;i++){
            numbers[i]=sc.nextInt();
        }
        sc.close();
      int ms=  mxsum(numbers);

    System.out.println(ms);
    }
}