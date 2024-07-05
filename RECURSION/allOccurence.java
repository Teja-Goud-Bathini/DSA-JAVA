public class allOccurence {
    public static void findoccuernace(int arr[], int key,int idx){
        if(idx==arr.length){
            return;
        }
        if(arr[idx]==key){
            System.out.println(idx);
        }
         findoccuernace(arr, key, idx+1);
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,7,2,2};
        findoccuernace(arr,2,0);
    }
}
