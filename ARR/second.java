package array;

public class second {
    public static void secondLast(int arr[])
    {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max2=max;
                max=arr[i];
            }
            
        }
        //  for(int i=0;i<n;i++)
        // {
        //     if(arr[i]>max)
        //     {
        //         max=arr[i];
        //     }
            
        // }
        //  for(int i=0;i<n;i++)
        // {
        //     if(arr[i]>max2 && arr[i]<max)
        //     {
        //         max2=arr[i];
        //     }
            
        // }
        
        System.out.println("Secondmax is "+max2);
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,9,4,9,1};
        secondLast(arr);

    }
    
}
