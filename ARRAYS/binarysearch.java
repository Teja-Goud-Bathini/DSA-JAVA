public class binarysearch {
    public static int binarySearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
           else if(arr[mid]<key){ //right
               start=mid+1;
            }
            else { //left
                end=mid-1;
            }
        }
     return -1;
    }
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6,7,8};
        int key=3;
        System.out.println("Key is found at index"+binarySearch(arr,key));
    }
}
