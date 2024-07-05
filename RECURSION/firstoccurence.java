public class firstoccurence {
    public static int firstocc(int arr[],int key,int idx){
        if(idx==arr.length-1){
            return -1;
        }
        if(arr[idx]==key){
            return idx;
        }
       return firstocc(arr, key, idx+1);
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,5,8};
        int key=50;
        int idx=0;
     int first=firstocc(arr,key,idx);
     System.out.println(first);
    }
}
