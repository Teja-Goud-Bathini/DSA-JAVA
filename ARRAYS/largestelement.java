/**
 * largestelement
 */
public class largestelement {
    public static int largest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
             if(arr[i]>largest){
                largest=arr[i];
        }
        }
        return largest;
       
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,444,342,321};
        int largest=largest(arr);
        System.out.println("Largest Element is"+largest);
    }
}