package ARR;

import java.util.ArrayList;

public class Monotone {
    public static boolean mono(ArrayList<Integer>arr){
            int n=arr.size();
            int c1=0;
            int c2=0;
            for(int i=0;i<n-1;i++){
            if(arr.get(i)>=arr.get(i+1)){
                c1++;
            }
            if(arr.get(i)<=arr.get(i+1)){
                c2++;
            }
            }
            if(c1+1==n||c2+1==n){
                return true;
            }
            return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(6);
        arr.add(5);
        arr.add(4);
        arr.add(8);
        System.out.println(mono(arr));
    }
}
