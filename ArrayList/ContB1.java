package ArrayList;

import java.util.ArrayList;

public class ContB1 {
    public static int MaxCont(ArrayList<Integer>containers){
        int rightP=containers.size()-1;
        int leftP=0;
        int maxS=0;
        while(leftP<rightP){
        int height=Math.min(containers.get(rightP),containers.get(leftP));
        int width=rightP-leftP;
        int curr=height*width;
        maxS=Math.max(maxS, curr);
        if(containers.get(leftP)<=containers.get(rightP)){
            leftP++;
        }
        else{
            rightP--;
        }
        }
        return maxS;

    }
    public static void main(String[] args) {
        ArrayList<Integer>containers=new ArrayList<>();//{1,8,6,2,5,4,8,3,7};
        containers.add(1);
        containers.add(8);
        containers.add(6);
        containers.add(2);
        containers.add(5);
        containers.add(4);
        containers.add(8);
        containers.add(3);
        containers.add(7);
        int maximum=MaxCont(containers);
        System.out.println(maximum);
    }

}
