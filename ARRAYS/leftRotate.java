/**
 * leftRotate
 */
public class leftRotate {
public static void main(String[] args) {
    int arr[]={1,1,2,2,3,4};
    int temp=arr[0];
   
    int n=arr.length;
    for(int i=1;i<n;i++){
        
      arr[i-1]=arr[i];
    }
    arr[n-1]=temp;
    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }

}
    
}