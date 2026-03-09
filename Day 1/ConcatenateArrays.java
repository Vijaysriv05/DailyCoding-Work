import java.util.*;
 public class ConcatenateArrays {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=s.nextInt();
        }
        int[] res=getConcatenation(nums);
        for(int i=0;i<res.length;i++){
        
        System.out.print(res[i]+" ");
        }
    }
    public  static int[] getConcatenation(int[] nums) {
        int[] arr=new int[nums.length+nums.length];
        
        for(int i=0;i<nums.length;i++){
        
            arr[i]=nums[i];
            arr[i+nums.length]=nums[i];
       
        }
        
    
        
        return arr;
    }
}