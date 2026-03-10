import java.util.*;
class Subsequence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        Subsequence obj=new Subsequence();
        boolean res= obj.isSubsequence( s,  t);
        System.out.print(res);
    }
    public  boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
                j++;
        }
            //return  i==s.length();
        
        return  i==s.length();
    }
}