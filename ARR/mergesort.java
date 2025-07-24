package divideandconquer;

public class mergesort {
    public static void pritarr(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
    public static void merge(int numbers[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        merge(numbers, si, mid);
        merge(numbers, mid+1, ei);
        mergeSort(numbers, si,mid,ei);
    }
    public static void mergeSort(int numbers[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];//6-0+1=7
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(numbers[i]<numbers[j]){
                temp[k]=numbers[i];
                i++;
            }
            else{
                temp[k]=numbers[j];
                j++;

            }
            k++;
        }
        while(i<=mid){
            temp[k]=numbers[i];
            k++;
            i++;
        }
        while(j<=ei){
            temp[k]=numbers[j];
            k++;
            j++;
        }
        for(int a=0,l=si;a<temp.length;a++,l++){
            numbers[l]=temp[a];
        }


    }
    public static void main(String[] args) {
        int numbers[]={6,3,9,5,2,8,-2};
        merge(numbers, 0, numbers.length-1);
        pritarr(numbers);
    }
    
}
