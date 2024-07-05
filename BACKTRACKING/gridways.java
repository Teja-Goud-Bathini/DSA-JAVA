import SORTINGS.selectionsorting;

public class gridways {
    public static  int countWays(int row,int col,int endrow,int endcol){

        if(row==endrow-1 && col==endcol-1){
            return 1;
        }else if(row==endrow || col==endcol){
            return 0;
        }
        int way1=countWays(row+1, col, endrow, endcol);
        int way2=countWays(row, col+1, endrow, endcol);
        return way1+way2;
    }
    public static void main(String[] args) {
        int n=3;
       int count= countWays(0,0,n,n);
        System.out.println(count);
      
        printways(0,0,"",3,3,0);
    }
    public static void printways(int r,int d,String ans,int endrow,int endcol ,int totalchar){
        if(totalchar==endrow-1+endcol-1){
            System.out.println(ans);
            return;
        }
             if(r<endrow){
                 printways(r+1,d, ans+'r', endrow, endcol,totalchar+1);
             }
            else if(d<endcol){
                 printways(r,d+1, ans+'d', endrow, endcol,totalchar+1);
             }
     
    }
}
