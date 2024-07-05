public class bruteforceMaxSum {
        public static void maxsum(int arr[]){
            int ms=Integer.MIN_VALUE;
            int cs=0;
            for(int i=0;i<=arr.length;i++){
                for(int j=i;j<=arr.length;j++){
                    cs=0;
                    for(int k=i;k<j;k++){
                        cs=cs+arr[k];
                    }
                    if(cs>ms){
                        ms=cs;
                    }
                }
            }
            System.out.println("maxSum is "+ms);
        }
    public static void main(String[] args) {
        int arr[]= {1,-2,6,-1,3};
        maxsum(arr);

    }
}
