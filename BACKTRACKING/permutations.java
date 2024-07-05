import java.util.ArrayList;
import java.util.List;

// import Stacks.stacksingArrayList;

class permutations {
    public static void permutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newString=str.substring(0, i)+str.substring(i+1);
            permutation(newString, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str="abcd";
        permutation(str,"");
        int nums[]={1,3,2};
        List<List<Integer>>result=permutationS(nums);;
        System.out.println(result);
    }
    public static List<List<Integer>> permutationS(int nums[]){//subsets
        List<List<Integer>> result=new ArrayList<>();
        find(nums,new ArrayList<>(),result);
        return result;
    }
 public static  void find(int nums[], List<Integer>list, List<List<Integer>> result){
     if(list.size()==nums.length){
        result.add(new ArrayList<>(list));
        return;
     }
      else{  for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i]))continue;
            list.add(nums[i]);
            find(nums,list,result);
            list.remove(list.size()-1);
        }
    }
    }
}
