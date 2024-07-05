import java.util.Stack;

public class secondlargest {
    public static void main(String[] args) {
        int arr[]={1,2,5,3,6,7,6,8,9,9};
      Stack<Integer>s=new Stack<>();
      for(int i=0;i<arr.length;i++){
        if(s.isEmpty()|| arr[i]>=arr[s.peek()]){
            System.out.println(s.push(arr[i]));
        }

      }
      int la=s.peek();
      while(s.peek()==la){
       System.out.println("Iam reomving topper "+ s.pop());;
      }
      System.out.println(s.peek());
    }
}
