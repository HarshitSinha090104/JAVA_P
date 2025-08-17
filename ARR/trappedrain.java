package array;

public class trappedrain {
    public static int  trapedrain(int numbers[])
    {
        int n=numbers.length;
        int  leftma=numbers[0];
        for(int i=1;i<n;i++)
        {
            leftma=Math.max(numbers[i],leftma);
        }     
        int rightma=numbers[n-1];
        for(int i=n-2;i>=0;i--)
        {
          rightma=Math.max(numbers[i],rightma);
        }
        int trappwater=0;
        for(int i=0;i<n;i++)
        {
            int waterlevel=Math.max(rightma,leftma);
            trappwater+=waterlevel-numbers[i];
        }
        return trappwater;
    }
    public static void main(String[] args) {
        int numbers[]={4,2,0,3,2,5};
        int rain=trapedrain(numbers);
        System.out.println(rain);
    }
    
}
