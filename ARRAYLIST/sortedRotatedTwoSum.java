import java.util.ArrayList;



public class sortedRotatedTwoSum {
    public static Boolean two(ArrayList<Integer>list,int target){
        int bp=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)<list.get(i+1)){
                bp=i;
            }
        }
        int lp=bp+1;
        int rp=bp;
        int n=list.size();
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
           else if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }
            else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
two(list);

    }
}
