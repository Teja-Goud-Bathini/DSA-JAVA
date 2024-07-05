public class setzerosMatrix {
    public static void setZeros(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];

        // Mark the rows and columns containing zeros
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        // Set rows containing zeros to zeros
        for (int i = 0; i < rows; i++) {
            if (zeroRows[i]) {
                setRow(i, arr);
            }
        }

        // Set columns containing zeros to zeros
        for (int j = 0; j < cols; j++) {
            if (zeroCols[j]) {
                setCol(j, arr);
            }
        }
    }

    public static void setRow(int row, int[][] arr) {
        for (int i = 0; i < arr[row].length; i++) {
            arr[row][i] = 0;
        }
    }

    public static void setCol(int col, int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][col] = 0;
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
