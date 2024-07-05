class lin{
    public static int linear(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
            
        }
          return -1;

    }
    public static void main(String[] args) {
        int arr[]={3,2,1,4,5,7,6,9,8};
        int key=9;
       int idx= linear(arr,key);
        System.out.println("Element is foun aT iNDX"+idx);
    }
}