public class setzeros {
    public static void setZeros(int [][]arr){
        int row[]=new int[4];
        int col[]=new int[4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(arr[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(row[i]==1||col[j]==1){
                    arr[i][j]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 0, 1}, {1, 1, 1, 1}};
        setZeros(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
