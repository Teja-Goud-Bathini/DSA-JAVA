

public class diagonalSum {
    public static int diagonalsum(int arr[][]){
        int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         if(i==j){
        //             sum=sum+arr[i][j];
        //         }
        //         if(i+j==arr.length-1){
        //             sum+=arr[i][j];
        //         }
        //     }
        // }
        //optimized solution
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i][i];
            sum+=arr[i][arr.length-1-i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
       int sum= diagonalsum(matrix);
       System.out.println(sum);
    }
}
