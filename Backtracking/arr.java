package backtracking;

import CLASS.pub;

public class arr {
    public static void a(int numbers[],int i, int val){
          //base
          if(i==5){
            printarr(numbers);
            return;
          }
          //recursive
          numbers[i]=val;
          a(numbers, i+1, val+1);
          //backtracing is always done after function call
          numbers[i]=numbers[i]-2;
    }
    public static void printarr(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.err.println();
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        a(arr, 0, 1);
        printarr(arr);
    }
}
