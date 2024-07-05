public class prefixSum {
    public static void prefix(int arr[]){
        int cs=0;int ms=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<=arr.length;i++){
            cs=0;
            for(int j=i;j<arr.length;j++){
                cs=i==0?prefix[j]:prefix[j]-prefix[i-1];
            }
            if(cs>ms){
                ms=cs;
            }
        }
        System.out.println(ms);
    }
    public static void main(String[] args) {
        int arr[]= {1,-2,6,-1,3};   
        prefix(arr);   
    }
}
