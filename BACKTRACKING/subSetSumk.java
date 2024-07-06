import java.util.ArrayList;
import java.util.List;

/**
 * subSetSumk
 */
public class subSetSumk {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=5;
        boolean flag=isThere(0,arr,target);
        System.out.println(flag);
        List<List<Integer>>result=find(arr,target);
        System.out.println(result);
    }
    public static boolean isThere(int index, int[] arr, int target) {
        if (target == 0) return true;
        if (target < 0 || index >= arr.length) return false;
        return isThere(index + 1, arr, target - arr[index]) || isThere(index + 1, arr, target);
    }
    public static List<List<Integer>> find(int arr[],int target){
        List<List<Integer>>result=new ArrayList<>();
        subSequence(0,arr,target,new ArrayList<>(),result);
        return result;
    }
    public static void subSequence(int index,int arr[],int target,List<Integer>list,List<List<Integer>>result){

        if(target==0){
            result.add(new ArrayList<>(list));
            return;
        }
        if (target < 0 || index > arr.length) return;
        for(int i=index;i<arr.length;i++){
            list.add(arr[i]);
            subSequence(i+1, arr, target-arr[i], list,result);
            list.remove(list.size()-1);
        }
    }

}