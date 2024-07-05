import java.util.Stack;

public class infixToPrefix {
    
    static int precedence(char ch) {
        switch(ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }
    
    static String infixToPrefix(String str) {
        StringBuilder result = new StringBuilder();
        Stack<Character> operators = new Stack<>();
        Stack<Integer> operands = new Stack<>();
        
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            
            if (Character.isDigit(ch)) {
                int operand = ch - '0';
                operands.push(operand);
            } else if (ch == ')') {
                operators.push(ch);
            } else if (ch == '(') {
                while (!operators.isEmpty() && operators.peek() != ')') {
                    char op = operators.pop();
                    int val1 = operands.pop();
                    int val2 = operands.pop();
                    result.append(op);
                    operands.push(val1);
                    operands.push(val2);
                }
                operators.pop(); // Pop the remaining '('
            } else {
                while (!operators.isEmpty() && precedence(ch) < precedence(operators.peek())) {
                    char op = operators.pop();
                    int val1 = operands.pop();
                    int val2 = operands.pop();
                    result.append(op);
                    operands.push(val1);
                    operands.push(val2);
                }
                operators.push(ch);
            }
        }
        
        while (!operators.isEmpty()) {
            result.append(operators.pop());
        }
        
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "5+9*(8-2)+3";
        String prefix = infixToPrefix(str);
        System.out.println(prefix); // Output should be "+*593+82"
    }
}
