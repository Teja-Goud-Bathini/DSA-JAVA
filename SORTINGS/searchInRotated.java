package SORTINGS;

public class searchInRotated {
    public static int search(int arr[],int target,int si,int ei){
        int mid=si+(ei-si)/2;
        if(arr[mid]==target){
            return mid;
        }
        //left line line1
        if(target<arr[mid]){
            if(target<=arr[mid] && target>=arr[si]){
                 return  search(arr, target, si, mid-1);
            }
            else{
                 return  search(arr, target, mid+1, ei);
            }
        }
        else {
            if(target>=arr[mid] && target<=arr[ei]){
                return   search(arr, target, mid+1, ei);
            }
            else{
                  return search(arr, target, si, mid-1);
            }
        }
      

    }
    public static void main(String[] args) {
        int arr[]={4,5,6,0,1,2};
        int idx=search(arr,0,0,arr.length-1);
        System.out.println(idx);
    }
}
