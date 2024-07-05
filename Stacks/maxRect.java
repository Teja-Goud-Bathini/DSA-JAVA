import java.util.Stack;

class maxRect{
    public static void main(String[] args) {
        int []arr={2,1,5,6,2,3};
        int res=largetRectangleArea(arr);
        System.out.println(res);//10
    }
 

   
        public static  int largetRectangleArea(int[] arr) {
            Stack<Integer> s = new Stack<>();
            int n = arr.length;
            int[] nse = new int[n];
            int[] pse = new int[n];
            
            // Calculate next smaller element
            for (int i = n - 1; i >= 0; i--) {
                while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                    s.pop();
                }
                if (s.isEmpty())
                    nse[i] = n;
                else
                    nse[i] = s.peek();
                s.push(i);
            }
    
            // Clear the stack
            while (!s.isEmpty())
                s.pop();
    
            // Calculate previous smaller element
            for (int i = 0; i < n; i++) {
                while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                    s.pop();
                }
                if (s.isEmpty())
                    pse[i] = -1;
                else
                    pse[i] = s.peek();
                s.push(i);
            }
    
            int largest = -1;
            for (int i = 0; i < n; i++) {
                int area = arr[i] * (nse[i] - pse[i] - 1);
                largest = Math.max(area, largest);
            }
            return largest;
        }
    }
    
