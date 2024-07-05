// package Stackss;

import java.util.Stack;

public class validParenthasis {
    public static void main(String[] args) {
        System.out.println(isValid("{}()[]"));
    }

        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            
            for (char ch : s.toCharArray()) {
                if (ch == '(' || ch == '[' || ch == '{') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) {
                        return false; // No matching opening parenthesis
                    }
                    
                    char top = stack.pop();
                    if ((ch == ')' && top != '(') ||
                        (ch == ']' && top != '[') ||
                        (ch == '}' && top != '{')) {
                        return false; // Mismatched opening and closing parenthesis
                    }
                }
            }
            
            return stack.isEmpty(); // Stack should be empty if all parentheses are matched
        }
    }
    

 
