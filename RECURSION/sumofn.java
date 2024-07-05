public class sumofn {
    public static int sumon(int n){
        if(n==1){
            return 1;
        }
        int snm1=sumon(n-1);
        int sum= n+snm1;
        return sum;
      
    }
    public static void main(String[] args) {
        int n=5;
        int sum=sumon(n);
        System.out.println(sum);
    }
}
