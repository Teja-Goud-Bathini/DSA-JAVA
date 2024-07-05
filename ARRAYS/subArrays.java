public class subArrays {
    public static void printsubarrays(int arr[]){
      
        for(int i=0;i<=arr.length;i++){
            int start=i;
            for(int j=i;j<=arr.length;j++){
                int end=j;
                for(int k=start;k<end;k++){
                    System.out.print(arr[k]+" ");
                  
                }
               
                //   ts++; //total Subarrays pairs
             
                
                
                   System.out.println();
                
            }
        
           
        }
       
        // System.out.println("Total Sub Arrays"+ts);//total SubArrays
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        printsubarrays(arr);
    }
}
