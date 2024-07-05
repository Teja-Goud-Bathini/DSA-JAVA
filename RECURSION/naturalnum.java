public class naturalnum {
public static void printDec(int n){
       if(n==1){
        System.out.print(1+" ");
        return;
    }
    System.out.print(n+" ");
    printDec(n-1);
 
}
public static void printIncr(int n){
   if(n==1){
    System.out.print(1+" ");
    return;
   }
   printIncr(n-1);
   System.out.print(n+" ");
}
    public static void main(String[] args) {
        int n=10;
        printDec(n);
        System.out.println();
        printIncr(n);
    }
}
