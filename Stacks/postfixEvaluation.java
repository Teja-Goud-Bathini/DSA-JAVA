import java.util.Stack;

public class postfixEvaluation {
    public static void main(String[] args) {
        String str="953+4*6/-";
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch) || s.isEmpty()){
              s.push(ch-'0' );
            }
            else{
                int v2=s.pop();
                int v1=s.pop();
                int result=0;
                switch(ch){
                    case '+': result=v1+v2;
                        break;
                     case '-': result=v1-v2;
                        break;
                    case '*': result=v1*v2;
                        break;
                    case '/': result=v1/v2;
                        break;
                }
           s.push(result);;
            }
        }
        System.out.println(s.peek());
        
    }
}
