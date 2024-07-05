package Stackss;

import java.util.Stack;

public class stockSpan {
    public static void solution(int[] stock,int[] span) {
    Stack <Integer>s=new Stack<>();
    span[0]=1;
    s.push(0);
    for(int i=1;i<stock.length;i++){
        while(!s.isEmpty() && stock[i]>stock[s.peek()]){
            s.pop();
        }
        if(s.isEmpty()){
            span[i]=i+1;
        }
        else{
            int prevHigh=s.peek();
            span[i]=i-prevHigh;
        }
        s.push(i);
    }
        
    }
    public static void main(String[] args) {
        int stock[]={100,50,60,40,90};
        int span[]=new int[stock.length];
        solution(stock,span);
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }
}
