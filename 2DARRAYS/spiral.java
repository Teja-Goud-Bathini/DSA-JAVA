

public class spiral {
    public static void printspriral(int arr[][]){
        int startrow=0;
        int endrow=arr.length-1;
        int startcol=0;
        int endcol=arr[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            //top row  j++start row fixed
            for(int j=startcol;j<=endcol;j++){
                System.out.print(arr[startrow][j]+" ");
            }
            //rightpart row decrease and endcol is fixed
            for(int i=startrow+1;i<=endrow;i++){
                if(startcol==endcol){
                    break;
                }
                System.out.print(arr[i][endcol] +" ");
            }
            //bottompart endcol-1 -- end row is fixed
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(arr[endrow][j]+" ");
            }
            //left part     end col-1 ++ start row   startcol fixed
            for(int i=endrow-1;i>=startrow+1;i--){
                System.out.print(arr[i][startcol]+" ");
            }

            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
    }
    public static void main(String[] args) {
    int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    printspriral(matrix);
    }
}
