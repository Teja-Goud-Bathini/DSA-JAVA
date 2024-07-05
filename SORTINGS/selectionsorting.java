package SORTINGS;

public class selectionsorting {
    public static void selectionsortings(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[j]<arr[minpos]){
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        selectionsortings(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
