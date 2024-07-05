import java.util.ArrayList;

public class trappingRainWater {
    public static int trap(ArrayList<Integer> list){
        int max=0;
        int lp=0;
        int rp=list.size();
        while(lp<rp){
            int height=Math.min(list.get(rp),list.get(lp));
            int length=rp-lp;
            int currwater=length*height;
            max=Math.max(max,currwater);
            if(lp<rp){
                lp++;
            }
            else{
                rp--;
        }
        }
        return max;
    }
public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    list.add(1);
    list.add(8);
    list.add(2);
    list.add(3);
    list.add(5);
    list.add(9);
    list.add(2);
    list.add(7);
    System.out.println(list);
int max=trap(list);
}
}
