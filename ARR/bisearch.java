package array;

import java.util.*;

public class bisearch {
    public static int binary_search(int marks[],int key){
        int start=0;
        int end=marks.length-1;
     
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(marks[mid]==key)
            {
                return mid;
            }
            if(marks[mid]>key)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;

    }
   
        public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int marks[]=new int[5];
    for(int i=0;i<marks.length;i++)
    {
        int mark=sc.nextInt();
        marks[i]=mark;
    }
    sc.close();
    int ls=binary_search(marks, 95);
    if(ls==-1)
    {
        System.out.print("NOT FOUND");
    }
    else
    System.out.println("FOUND AT "+(ls+1));

    }
    
}
