public class floorceil {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,7,9};
      int ans= ceil(arr,5);
        System.out.println("smallest greater than target "+ans);
        int floor=floor(arr,5);
        System.out.println("Greatest smaller than target "+floor);

    }
    public static int floor(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<=x){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;

    }
    public static int ceil(int arr[],int x){
       
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
