/**
 * subSetSumk
 */
public class subSetSumk {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=15;
        boolean flag=isThere(0,arr,target);
        System.out.println(flag);
    }
    public static boolean isThere(int index,int arr[],int target){
        if(target==0)return true;
        if(target<0 || index>arr.length)return false;
        return isThere(index+1,arr,target-arr[index])||isThere(index+1, arr, target);
    }
}