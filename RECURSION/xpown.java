public class xpown {
    public static int pow(int x,int n){
        if(n==0){return 1;}

        return x*pow(x, n-1);
    }
    //optimized 
    public static int optimized(int x,int n){
        if(n==1){
            return x;
        }
        int halfpow=optimized(x, n/2);
       int halfpowsquare= halfpow*halfpow;
    
     if(n%2 != 0){
       halfpowsquare= x*halfpowsquare;
     }
        return halfpowsquare;
        // if(n%2==0){
        //     return optimized(x, n/2)*optimized(x, n/2);
        // }
        //  return   optimized(x, 1)*optimized(x, n/2)*optimized(x, n/2);
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        System.out.println(optimized(x,n));
    }
}
