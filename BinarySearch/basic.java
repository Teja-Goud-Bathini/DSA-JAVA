public class basic {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,8,9};
        int target=9;
       int idx= searchrec(arr,arr.length,target);
       System.out.println(idx);

    }
    public static int searchrec(int arr[],int n,int target){
    return helper(arr,0,n-1,target);
    }
    public static int helper(int arr[],int start,int end,int target){
        if(start>end){
            return -1;
        }
        int mid=(start+end)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target>arr[mid]){
            return helper(arr, mid+1, end, target);
        }
        else{
            return helper(arr, start, mid-1, target);
        }
    }


    public static int search(int arr[],int n,int target){
int start=0;
int end=n-1;
while(start<=end){
    int mid=(start+end)/2;
    if(arr[mid]==target){
        return mid;
    }
    else if(target>arr[mid]){
        start=mid+1;
    }
    else{
        end=mid-1;
    }
}
return -1; }
   
}
