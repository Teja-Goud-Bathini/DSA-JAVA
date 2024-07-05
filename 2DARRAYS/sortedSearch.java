

public class sortedSearch {
    public static void stairCase(int arr[][],int key){
        // int row=0;
        // int col=arr[0].length-1;
        // while(row<arr.length && col>=0){
        //     if(arr[row][col]==key){
        //         System.out.println("Key Found at ("+row+","+col+")");
        //         break;
        //     }
        //     if(key<arr[row][col]){
        //         col--; //LEFT SIDE
        //     }
        //     if(key>arr[row][col]){
        //         row++; //RIGHTSIDE
        //     }
        // }
        int row=arr.length-1;
        int col=0;
        while(row>=0 && col<=arr.length-1){
            if(arr[row][col]==key){
                System.out.println(row+" "+col);
                break;
            }
            if(key<arr[row][col]){
                row--;
            }
            else if(key>arr[row][col]){
                col++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        stairCase(arr,33);
    }
}
