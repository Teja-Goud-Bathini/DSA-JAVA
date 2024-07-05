package Stacks;

import java.util.Stack;

public class reverseStack {
    public static void revStack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        revStack(s);
        pushAtB(s,top);
    }
    public static void pushAtB(Stack<Integer> s,int n){
        if(s.isEmpty()){
            s.push(n);
            return;
        }
        int last=s.pop();
        pushAtB(s, n);
        s.push(last);
    }
    public static void printStack(Stack<Integer>s){
        while(!s.isEmpty()){
          int top=  s.pop();
          System.out.println(top);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //  printStack(s); //321
        revStack(s);//123
        printStack(s);
    }
}

