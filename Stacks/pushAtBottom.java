package Stacks;

import java.util.Stack;

public class pushAtBottom {
    public static void pushAtB(Stack<Integer> s,int n){
        if(s.isEmpty()){
            s.push(n);
            return;
        }
        int last=s.pop();
        pushAtB(s, n);
        s.push(last);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtB(s,4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
