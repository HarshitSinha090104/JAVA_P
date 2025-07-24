package ArrayList;

import java.util.ArrayList;

public class PairSum2 {
    public static boolean pairS(ArrayList<Integer>arr,int target){
        int n=arr.size();
        int leftP=0;
        int rightP=0;
        for(int i=0;i<n;i++){
            if(arr.get(i)>arr.get(i+1)){
                leftP=i+1;
                rightP=i;
                break;
            }
        }
            while(leftP!=rightP){
                if(arr.get(leftP)+arr.get(rightP)==target){
                    return true;
                }
                else if(arr.get(leftP)+arr.get(rightP)<target){
                    leftP=(leftP+1)%n;
                }
                else if(arr.get(leftP)+arr.get(rightP)>target){
                    rightP=(n+rightP-1)%n;
                } 
            }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(11);
        arr.add(15);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        System.out.println(pairS(arr, 16));
 
}
}

