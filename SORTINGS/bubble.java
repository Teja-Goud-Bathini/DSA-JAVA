package SORTINGS;

class bubble {
    public static void Bubblesorting(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int count=0;
            // int tc=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    count++;
                   
                   
                }
                
                
                if(count==0){
                    break;
                }

            }
            System.out.println(count);
         
        }

    }
    public static void main(String[] args) {
         int arr[]={5,4,1,2,3};
         Bubblesorting(arr);
         for(int i=0;i<arr.length;i++){
                     System.out.print(arr[i]+" ");
         }

    }
}