import java.util.ArrayList;

public class twosum {
    public static void twosumsol(ArrayList<Integer>list,int target){
        int i=0;int j=list.size()-1;
        while(i!=j){
            if(list.get(i)+list.get(j)==target){
                System.out.println(i+" "+j);
                break;
            }
            else if(list.get(i)+list.get(j)>target){
                j--;
            }
              else if(list.get(i)+list.get(j)<target){
                i++;
            }
           
        }
       // System.out.println("Not Found");

    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        // list.add(1);
        // list.add(2);
        int j=1;
        System.out.println(list);
        for(int i=0;i<5;i++){
            list.add(i,j++);
        }
          System.out.println(list);
          twosumsol(list,9);

    }
}
