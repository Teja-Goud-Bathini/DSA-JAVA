import java.util.Stack;

public class prefixIndetail{
    
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
        
        System.out.println("Start with an empty val stack and an empty op stack.");

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            System.out.println("Processing character: " + ch);
            
            if (Character.isDigit(ch)) {
                int operand = ch - '0';
                operands.push(operand);
                System.out.println("Push operand " + operand + " onto the operands stack.");
            } else if (ch == ')') {
                operators.push(ch);
                System.out.println("Push '" + ch + "' onto the operators stack.");
            } else if (ch == '(') {
                while (!operators.isEmpty() && operators.peek() != ')') {
                    char op = operators.pop();
                    int val1 = operands.pop();
                    int val2 = operands.pop();
                    result.append(op);
                    operands.push(val1);
                    operands.push(val2);
                }
                operators.pop(); // Discard the ')'
                System.out.println("Perform the operations: " + result.toString());
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
                System.out.println("Push '" + ch + "' onto the operators stack.");
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
        System.out.println("Prefix expression: " + prefix);
    }
}

