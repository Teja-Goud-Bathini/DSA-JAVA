public class removeDuplica{
    public static int remove(int arr[]){
        int n=arr.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
        
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4};
       int c= remove(arr);
        System.out.println(c);
        for(int i=0;i<c;i++){
            System.out.println(arr[i]);
        }
    }
}
