import java.util.ArrayList;
import java.util.*;

public class subsets {
    public static void subset(String str,String ans,int i){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        
        subset(str, ans+str.charAt(i), i+1);
        subset(str, ans, i+1);
        
    }
    public static void main(String[] args) {

        String str="abc";
        subset(str,"",0);
        System.out.print("\n");
        int nums[]={1,2,3};
       List<List<Integer>>result= subsets(nums);
       System.out.println(result);
       int nums2[]={1,2,2};
       List<List<Integer>>result2= subsetsII(nums2);
       System.out.println(result2);
       
    }
  public static List<List<Integer>> subsets(int nums[]){//subsets
        List<List<Integer>> result=new ArrayList<>();
        find(0,nums,new ArrayList<>(),result);
        return result;
    }
 public static  void find(int index,int nums[], List<Integer>list, List<List<Integer>> result){
        result.add(new ArrayList<>(list));
        for(int i=index;i<nums.length;i++){
            list.add(nums[i]);
            find(i+1,nums,list,result);
            list.remove(list.size()-1);
        }
    }
        //SubSets2
        public static List<List<Integer>> subsetsII(int nums[]){//subsets
            List<List<Integer>> result=new ArrayList<>();
            Arrays.sort(nums);
            findSubSetsII(0,nums,new ArrayList<>(),result);
            return result;
        }
     public static  void findSubSetsII(int index,int nums[], List<Integer>list, List<List<Integer>> result){
            result.add(new ArrayList<>(list));
            for(int i=index;i<nums.length;i++){
                if(i>index&&nums[i]==nums[i-1])continue; //Skip Duplicats
                list.add(nums[i]);
                findSubSetsII(index+1, nums, list, result);
                 list.remove(list.size()-1);
            }
        }
    }

