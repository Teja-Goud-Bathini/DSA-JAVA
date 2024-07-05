import java.util.*;
public class basic {
    public static int max(ArrayList<Integer>list){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max=Math.max(max, list.get(i));
        }
        return max;
    }
    public static void swap(ArrayList<Integer>list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.print(list);
        //get Element
        int element=list.get(1);
        System.out.println(element);
        //remove Elemnt
        list.remove(1);
        System.out.println(list);
        //ading elemnt at you wish index
        int j=2;
        for(int i=1;i<5;i++){
            list.add(i,j++);
        }
        System.out.println(list);
        int max1= max(list);
        System.out.println("Maximu Element in list"+max1);
        swap(list,1,3);
        System.out.println("after Swaping "+list);
        //sorting 
        Collections.sort(list);
        System.out.println("aFTER SORTING "+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("After Reverse Order "+list);
    }

}
