public class ratmaze {
    public static void sol(int maze[][],int row,int col,int endrow,int endcol){
        if(row==endrow && col==endcol){
            printing(maze);
            return;
        }
        for(int i=row+1,j=col+1;i<=endrow&&j<=endcol;i++,j++){
            if(maze[i][j]==1){
                maze[row][col]=1;
               sol(maze, row+1, col, endrow, endcol);
               maze[row][col]=0; 
            }
            sol(maze, row, col+1, endrow, endcol);
        }

    }
    public static void printing(int maze[][]){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
    }
 
    public static void main(String[] args) {
        int maze[][]={{1,0,0,0},{1,1,0,1},{0,1,0,0},{1,1,1,1}};
        System.out.println("hi");
        solve(maze);
    }
}
