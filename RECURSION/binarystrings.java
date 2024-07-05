class binaryStrings{
    public static void printBinaryStrings(int n,int lastidx,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
       
        // if(lastidx==0){
        //     printBinaryStrings(n-1, 0, str.append(0));
        //      printBinaryStrings(n-1, 1, str.append(1));
        // }
        // else{
        //      printBinaryStrings(n-1, 0, str.append(0));
        // }
          printBinaryStrings(n-1, 0, str+"0");
          if(lastidx==0){
              printBinaryStrings(n-1, 1, str+"1");
          }
    }
    public static void main(String[] args) {
        // printBinaryStrings(3,0,(""));
        dontprintconsectivezeros(3,0,(""));
    }
    public static void dontprintconsectivezeros(int n, int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        if(lastplace==1){
            dontprintconsectivezeros(n-1, 0, str+"0");
            dontprintconsectivezeros(n-1, 1, str+"1");
        }
        dontprintconsectivezeros(n-1, 1, str+"1");
    }
}