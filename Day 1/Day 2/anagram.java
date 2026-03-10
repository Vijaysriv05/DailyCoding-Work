import java.util.*;
class anagram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        anagram obj=new anagram();
        boolean res= obj.isAnagram(s,t);
        System.out.print(res);
    }
    public boolean isAnagram(String s, String t) {
     char ch1[]=s.toCharArray();
     char ch2[]=t.toCharArray();
     int[] freq=new int[128];
     if(s.length()!=t.length()) return false;
     for(char c:ch1){
      freq[c]=freq[c]+1;
     }
     for(char c:ch2){
        freq[c]=freq[c]-1;
     }
     for(int i:freq){
        if(i!=0) return false;
     }
     return true;
}
}
