public class stringRevRECR {
    public static Boolean isTrue(String str, int l,int n){
        if(l>n/2){
            return true;
        }
        if(str.charAt(l)!=str.charAt(n-l-1)){
            return false;
        }
        return isTrue(str, l+1, n);
    }
 
    public static void main(String[] args) {
        String str="mad1m";
        System.out.println(isTrue(str,0,str.length()));
    }
}
