package ArrayList;

public class ContB {
    public static  int MaxCont(int []containers){
        int n=containers.length;
        int maxS=0;
        int sum=0;
        for(int i=0;i<n-1;i++){
            int leftindex=i;
            for(int j=i+1;j<n;j++){
              int length=j-leftindex;
              int MinH=Math.min(containers[leftindex],containers[j]);
              sum=length*MinH;
              maxS=Math.max(maxS, sum);
            }
        }
        return maxS;
    }
    public static void main(String[] args) {
        int containers[]={1,8,6,2,5,4,8,3,7};
        int maximum=MaxCont(containers);
        System.out.println(maximum); 
    }
}
