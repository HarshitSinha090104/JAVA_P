package array;
import java.util.*;

public class prefix {
    

    public static int mxsum(int numbers[]){
        int crs=0;
        int maxsum=Integer.MIN_VALUE;
        int prefixs[]=new int[numbers.length];
        prefixs[0]=numbers[0];
        for(int i=1;i<numbers.length;i++)
        {
            prefixs[i]=prefixs[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++)
        {
            crs=0;


            for(int j=i;j<numbers.length;j++)
            {
              int end=j;
              int start=i;
              crs = start==0 ? prefixs[0] : prefixs[j]-prefixs[i-1];
     
                
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

      System.out.println("required sum is");
    System.out.println(ms);
    }
}
