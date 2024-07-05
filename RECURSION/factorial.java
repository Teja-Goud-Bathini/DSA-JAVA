class factorials{
    public static int printFact(int n){
        if(n==1){
            return 1;
        }
      
    return n* printFact(n-1);
    }
    public static void main(String[] args) {
        int n=5;
       int sum= printFact(n);
       System.out.println(sum);
    }
}