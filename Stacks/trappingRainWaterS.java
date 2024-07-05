import java.util.Stack;

public class trappingRainWaterS {
    public static void main(String[] args) {
        int arr[]={7,0,4,2,5,0,6,4,0,5};
        int result=trap(arr);
        System.out.println(result);
    }
    public static int trap(int arr[]){
        Stack <Integer>s=new Stack<>();
        int n=arr.length;
        int rma[]=new int[n];
        int lma[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty()&& arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                rma[i]=-1;
            }
            else{
                rma[i]=arr[s.peek()];
            }
            s.push(i);
        }
        print(rma);
        while(!s.isEmpty()) s.pop();
        for(int i=0;i<n-1;i++){
            while(!s.isEmpty()&& arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                lma[i]=-1;
            }
            else{
                lma[i]=arr[s.peek()];
            }
            s.push(i);
        }
        print(lma);
        int sum=0;
        for(int i=0;i<n;i++){
            int min=Math.min(lma[i],rma[i]);
           if(min-arr[i]>0){
            sum=sum+min-arr[i];
           }
        }
        return sum;

    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
     System.out.println();
    }
}
