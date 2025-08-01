package Stacks;

import java.util.Stack;

public class NextGreater {
    public static int[] Maximum(int arr[]){
        Stack<Integer>S=new Stack<>();
        int maxi[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
           while(!S.isEmpty() && arr[S.peek()]<=arr[i]){
            S.pop();
           }
           if(S.isEmpty()){
            maxi[i]=-1;
           }
           else{
            maxi[i]=arr[S.peek()];
           }
           S.push(i);
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[]={7,10,2,4,3,1};
        // Stack<Integer>S=new Stack<>();
        // int maxi[]=new int[arr.length];
        // for(int i=arr.length-1;i>=0;i--){
        //    while(!S.isEmpty() && arr[S.peek()]<arr[i]){
        //     S.pop();
        //    }
        //    if(S.isEmpty()){
        //     maxi[i]=-1;
        //    }
        //    else{
        //     maxi[i]=arr[S.peek()];
        //    }
        //    S.push(i);
        // }
        int[] ma=Maximum(arr);
        for(int i=0;i<ma.length;i++){
            System.out.println(ma[i]);
        }    
    }
}
