

import java.util.*;

class nextGreater{
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int arr[] = {6,8,0,1,3};
        int result[] = new int[arr.length];
       
        for (int i = arr.length - 1; i >= 0; i--) {
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            } 
                if (s.isEmpty()) {
                    result[i] = -1;
                } else {
                    result[i] = arr[s.peek()];
                }
            
            s.push(i);

        }
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]+" ");
        }
    }
}