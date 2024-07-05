package SORTINGS;
public class quickSort {
    public static void quicksorting(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pivotIndex=partion(arr,si,ei);
        quicksorting(arr, si, pivotIndex-1);
        quicksorting(arr, pivotIndex+1, ei);
    }
    public static int partion(int arr[],int si,int ei){
        int i=si-1;
        int pivot=arr[ei];
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
            int temp=pivot;
                arr[ei]=arr[i]; //pivot ==arr[i] wrong statement
                arr[i]=temp;
                return i;
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,2,3};
        quicksorting(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
        }
    }
}
