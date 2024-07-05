public class trappingRainWater {
    public static int trappedrain(int arr[]){
        int n=arr.length;
        int trappedrain=0;
        //left max
        int leftMax[]=new int[n];
        leftMax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],arr[i]);
        }
        //Right Max
          int rightMax[]=new int[n];
        rightMax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1 ],arr[i]);
        }
        for(int i=0;i<n;i++){
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            trappedrain+=waterLevel-arr[i];
            
        }
        return trappedrain;
    }
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        int tr=trappedrain(arr);
        System.out.println(tr);
    }
}
