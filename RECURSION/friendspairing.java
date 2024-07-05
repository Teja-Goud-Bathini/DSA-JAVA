public class friendspairing {
    public static int friendspair(int n){
        if(n==1 || n==2){
            return n;
        }
        return friendspair(n-1)+n-1*friendspair(n-2);
        // //single
        // int fnm1=friendspair(n-1);
        // //friends
        // int fnm2=(n-1)*friendspair(n-2);
        // int totpairs=fnm1+fnm2;

        // return totpairs;
    }
    public static void main(String[] args) {
        System.out.println(friendspair(3));
    }
}
