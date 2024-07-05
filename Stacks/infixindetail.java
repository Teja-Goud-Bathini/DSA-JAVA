import java.util.Stack;

public class infixindetail {
    

    public static void main(String[] args) {
        String str = "8+6*(8+6)";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        System.out.println("Start with an empty val stack and an empty op stack.");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println("Processing character: " + ch);

            if (Character.isDigit(ch)) {
                int num = ch - '0'; // Convert char to integer
                val.push(num);
                System.out.println("Push " + num + " onto the val stack.");
            } else if (op.isEmpty() || ch == '(' || op.peek() == '(') {
                op.push(ch);
                System.out.println("Push '" + ch + "' onto the op stack.");
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    evaluate(val, op);
                }
                op.pop(); // Discard the '('
                System.out.println("Perform the operations: " + val.peek());
            } else {
                while (!op.isEmpty() && precedence(ch) <= precedence(op.peek())) {
                    evaluate(val, op);
                }
                op.push(ch);
                System.out.println("Push '" + ch + "' onto the op stack.");
            }
        }
        while (!op.isEmpty()) {
            evaluate(val, op);
        }
        System.out.println("Result: " + val.peek());
    }

    static void evaluate(Stack<Integer> val, Stack<Character> op) {
        int v2 = val.pop();
        int v1 = val.pop();
        char operator = op.pop();
        int result;
        switch (operator) {
            case '+':
                result = v1 + v2;
                break;
            case '-':
                result = v1 - v2;
                break;
            case '*':
                result = v1 * v2;
                break;
            case '/':
                if (v2 != 0)
                    result = v1 / v2;
                else
                    throw new ArithmeticException("Division by zero");
                break;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
        val.push(result);
        System.out.println("Perform the operations: " + v1 + " " + operator + " " + v2 + " = " + result);
    }

    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }
}


