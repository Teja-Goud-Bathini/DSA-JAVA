public class rotate90 {
    public static void rotate(int [][]arr){
       int endcol=4-1;
        int result[][]=new int [4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
               
               result[j][endcol]=arr[i][j];
               
            }
            endcol--;
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
               
                arr[i][j]= result[i][j];
               
            }
           
        }

    }
    public static void main(String[] args) {
        int arr [][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotate(arr);
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                    System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
