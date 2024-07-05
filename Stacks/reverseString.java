package Stacks;

import java.util.Stack;

public class reverseString {
    public static String rev(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx<=str.length()-1){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result=new StringBuilder("");
        while(!s.isEmpty()){
           char curr= s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s="Abc";
        String result=rev(s);
        System.out.println(result);
    }
}
