public class reverseArrayRECR {
    public static void rev(int arr[]) {
        helper(0, arr.length - 1, arr);
    }

    public static void helper(int l, int r, int arr[]) {
        if (l > r) {
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        helper(l + 1, r - 1, arr);
    }
    public static void rev2(int i,int arr[]){
        if(i>arr.length/2){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[arr.length-i-1];
        arr[arr.length-i-1]=temp;
        rev2(i+1,arr);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        // rev(arr);
        rev2(0,arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
