public class max {
    public static int maxi(int arr[]){
        int max=-1024;
        
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
      
        int cs=0;
        for(int i=0;i<arr.length;i++){
            cs=Math.max(arr[i],arr[i]+cs);
            max=Math.max(cs,max);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,-4};//
        int result=maxi(arr);
        System.out.println(result);
    }
}
