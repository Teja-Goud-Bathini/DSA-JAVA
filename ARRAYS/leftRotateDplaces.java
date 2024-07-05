public class leftRotateDplaces {
    public static void rotate(int arr[],int n,int d){
        reverse(arr,0,n-d-1);
        reverse(arr,n-d,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int []arr,int s,int e){
        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }

    }
public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6};
    int d=3;
    int n=arr.length;
    rotate(arr,n,d);
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    d=d%n;
   
    int temp[]=new int[d];
    //temp == 1 2 3 4
    for(int i=0;i<d;i++){
        temp[i]=arr[i];
    }
    // 5,6
    for(int i=d;i<n;i++){
        arr[i-d]=arr[i];
    }
    //putting back of 5,6 from temp[]=>5,6,1,2,3,4
    for(int i=n-d;i<n;i++){
        arr[i]=temp[i-(n-d)];
    }
   



}
}
