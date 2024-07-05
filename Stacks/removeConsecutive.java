package Stacks;

import java.util.Stack;

public class removeConsecutive {
    public static int[] remove(int[]arr){
        Stack <Integer> s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(s.isEmpty()||s.peek()!=arr[i]){
                s.push(arr[i]);
            }
          else if(s.peek()==arr[i]){
                if(i==arr.length-1 || arr[i]!=arr[i+1]){
                    s.pop();
                }
            }
        }
        int [] result=new int[s.size()];
        for(int i=result.length-1;i>=0;i--){
            result[i]=s.pop();
        }
        return result;

    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,4,5,6,6,6,7};
        int res[]=remove(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
