import java.util.ArrayList;

public class twodArray {
    // public static void table(ArrayList<ArrayList<Integer>> Main,ArrayList<Integer>list1,ArrayList<Integer>list2){
    //     for(int i=0;i<Main.size();i++){
    //         ArrayList<Integer>curr=Main.get(i);
    //         for(int j=0;j<curr.size();j++){
    //             System.out.println(Main.get(j)+" ");
    //         }
    //         System.out.println();
    //     }
    // }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> MainList=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
       for(int i=1;i<5;i++){
        list1.add(i*1);
        list2.add(i*2);
       }
        MainList.add(list1);
        MainList.add(list2);
        System.out.println(MainList);
        // table(MainList,list1,list2);

    }
}
