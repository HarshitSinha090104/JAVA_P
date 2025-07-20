package ArrayList;

import java.util.ArrayList;

public class pairSumB1 {
    public static boolean pairS(ArrayList<Integer>arr,int target){
        int rightP=arr.size()-1;
        int leftP=0;
        while(leftP<rightP){
            if(arr.get(leftP)+arr.get(rightP)==target){
                return true;
            }
            else if(arr.get(leftP)+arr.get(rightP)<target){
                leftP++;
            }
            else{
                rightP--;
            }
        }
        return false;

    }
    public static void main(String args[]){
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println(pairS(arr, 5));
    }
}
