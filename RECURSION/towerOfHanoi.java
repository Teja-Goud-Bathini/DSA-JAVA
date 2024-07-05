public class towerOfHanoi {
    public static void find(int n,String src,String Helper,String Dest){
        if(n==1){
            System.out.println("move"+n+src+"to "+Dest);
            return;
        }
      find(n-1, src, Dest, Helper);
      System.out.println("move"+n+"from"+src+"to"+Dest);
      find(n-1, Helper, src,Dest);
    }
    public static void main(String[] args) {
        int n=3;
        find(n,"A","B","C");
    }
}
