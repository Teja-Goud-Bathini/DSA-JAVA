public class lastoccerence {
      public static int lastocc(int arr[],int key,int idx){
 if(idx==arr.length-1){
    return -1;
 } 
 int isFound=lastocc(arr, key, idx+1);
 if(isFound==-1 &&arr[idx]==key){
    return idx;
 }
 return isFound;
}
public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,5,8};
    int key=5;
    int idx=0;
 int first=lastocc(arr,key,idx);
 System.out.println(first);
}
}
