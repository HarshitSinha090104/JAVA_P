package ARR;

import java.util.ArrayList;

public class Lonely {
    public static ArrayList<Integer> findL(ArrayList<Integer>arr){
              ArrayList<Integer>Lone=new ArrayList<>();
              int n=arr.size();
              int c=0;
              for(int i=0;i<n;i++){
                c=0;
                for(int j=i+1;j<n;j++){
                    if(arr.get(i)==arr.get(j)||(arr.get(i)-1)==arr.get(j)||(arr.get(i)+1)==arr.get(j)){
                      break;
                    }
                    c++;
                }
                if(c+1==n){
                    Lone.add(arr.get(i));
                }
              }
              return Lone;
    }
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(3);
        System.out.println(findL(arr));

    }
}
