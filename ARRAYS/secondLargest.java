public class secondLargest {
    public static int largest(int []arr){
        int lar=-1;
        int second=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                second=lar;
                lar=arr[i];
            }
            else if(second>arr[i] &&arr[i]!=lar){
                second=arr[i];
            }
        }
        return second;
    }
    public static void main(String[] args) {
       int arr[]={1,2,3,6,4,7,9};
       int result=largest(arr);
System.out.println(result);
    }
}
