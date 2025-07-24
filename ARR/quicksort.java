package divideandconquer;

public class quicksort {
    public static void pritarr(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
    public static void quicks(int numbers[],int si,int ei){
        if(si>=ei){
            return;

        }
        int pdx=partion(numbers,si,ei);
        quicks(numbers, si, pdx-1);
        quicks(numbers, pdx+1, ei);
    }
    public static int partion(int numbers[],int si,int ei){
        int pivot=numbers[ei];
        int i=si-1;
        for(int j=si;j<=ei;j++){
            if(numbers[j]<pivot){
                i++;
                int temp=numbers[i];
                numbers[i]=numbers[j];
                numbers[j]=temp;

            }
        }
        i++;
        int temp=numbers[i];
        numbers[i]=numbers[ei];
        numbers[ei]=temp;
        return i;
    }
    public static void main(String[] args) {
        int numbers[]={6,3,9,5,2,8,-2};
        quicks(numbers, 0, numbers.length-1);
        pritarr(numbers);
    }
}
