import java.util.Stack;

public class infix {
    public static void main(String[] args) {
        String str = "8+6*(8+6)";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                int num=ch-'0';
               val.push(num);
               System.out.println(num);
               
             }
             else if(op.isEmpty()||ch=='('||op.peek()=='('){
              System.out.println(  op.push(ch));;
             }

             else if(ch==')'){
                while(op.peek()!='('){
                    evaluate(val,op);
                }
                op.pop();
             }
             else{
                while(!op.isEmpty() && precedence(ch)<=precedence(op.peek())){
                    evaluate(val,op);
                    
                }
                op.push(ch);
             }
             
    }
    while(!op.isEmpty()){
        evaluate(val,op);
     }
     System.out.println(val.peek());
}
public static int precedence(Character ch){
    switch(ch){
        case '+':   return 1;
        case '-':   return 1;
         
        case '*':return 2;
        case '/':return 2;
            
    }
    return -1;
}
public static void evaluate(Stack<Integer>val,Stack<Character>op)
 {
    int v2=val.pop();
    int v1=val.pop();
    char o=op.pop();
    int result=0;
    switch(o){
        case '-':result=v1-v2;
                break;
        case '+':result=v1+v2;
                break;
        case '*':result=v1*v2;
                break;
        case '/':result=v1/v2;
    }
    val.push(result);
    System.out.println("Perform the operations: " + v1 + " " + o+ " " + v2 + " = " + result);
 } 
}
