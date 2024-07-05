package Queue;

import java.util.*;


public class reverse1stk {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        Stack<Integer>s=new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int k=3;
        for(int i=0;i<k;i++){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        for(int i=1;i<n-k;i++){
            
        }
       
    }
}
