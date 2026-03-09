import java.util.*;
 public class ContainsDuplicate {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=s.nextInt();
        }
        boolean res=hasDuplicate(nums);
        System.out.print(res);
    }
    public static boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean ans=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                ans=true;
            }
        }
        if(ans)return true;
        else return false;
    }
}