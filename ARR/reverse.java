package array;

import java.util.*;

public class reverse {
  public static void reverse1(int numbers[]){
    int start=0;
    int end=numbers.length-1;
    while(start<end)
    {
        int temp=numbers[start];
        numbers[start]=numbers[end];
        numbers[end]=temp;
        start++;
        end--;
    }
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

    reverse1(marks);
    for(int i=0;i<marks.length;i++)
    {
        System.out.print(marks[i]);
    }


   }    
}
