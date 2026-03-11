import java.util.*;
 public class  MaxConsecutiveOnes {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=s.nextInt();
        }
        MaxConsecutiveOnes obj=new MaxConsecutiveOnes();
        int res= obj.findMaxConsecutiveOnes(nums);
        
        
        System.out.print(res);
        }
    

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcount=0;
        int currentcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                currentcount++;
                maxcount=Math.max(maxcount,currentcount);
            }
            else{
                currentcount=0;
            }
            
        }
        return maxcount;
    }
}  