import java.util.Scanner;

class pascals{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter array values");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(find(arr,n));
    }
    public static int find(int arr[],int n){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n-3;i++){
           int  diff=(arr[i+2]-arr[i]);
            System.out.println(diff);
        }
        return min;
    }
}