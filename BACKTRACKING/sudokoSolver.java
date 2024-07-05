public class sudokoSolver {
    public static Boolean sudkosol(int suduko[][],int row,int col){
       //Base Case
        if(row==9){
            return true;
        }
        //next element
        int nextrow=row;int nextcol=col+1;
        if(col+1==9){
            nextrow=row+1;
            nextcol=0;
        }
        //fixed Elements
        if(suduko[row][col]!=0){
            return sudkosol(suduko, nextrow, nextcol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(suduko,row,col,digit)){
                suduko[row][col]=digit;
                if(sudkosol(suduko, nextrow, nextcol)){
                    return true;
                }
                suduko[row][col]=0;
            }
             
        }

        return false;
    }
    public static Boolean isSafe(int suduko[][],int row,int col,int digit){
        //comparing downpart => column 
        for(int i=0;i<9;i++){
            if(suduko[i][col]==digit){
                return false;
            }
        }

        //row comparing
        for(int j=0;j<9;j++){
            if(suduko[row][j]==digit){
                return false;
            }
        }
        //grid Part
        int rs=(row/3)*3;
        int cs=(col/3)*3;
        for(row=rs;row<rs+3;row++){
            for(col=cs;col<cs+3;col++){
                if(suduko[row][col]==digit){
                    return false;
                }
            }
        }

        return true;
    }
    public static void printSudko(int suduko[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(suduko[i][j]+" ");

            }
            System.out.println();
        } 
}
    public static void main(String[] args) {
        int suduko[][]={{0,0,8,0,0,0,0,0,0},
                        {4,9,0,1,5,7,0,0,2},
                        {0,0,3,0,0,4,1,9,0},
                        {1,8,5,0,6,0,0,2,0},
                        {0,0,0,0,2,0,0,6,0},
                        {9,6,0,4,0,5,3,0,0},
                        {0,3,0,0,7,2,3,0,4},
                        {0,4,9,0,3,0,0,5,7},
                        {8,2,7,0,0,9,0,1,3}};
        if(sudkosol(suduko,0,0)){
            System.out.println("solution Exist");
            printSudko(suduko);
        }
        else{
            System.out.println("sol not exits");
        }
    }
}
