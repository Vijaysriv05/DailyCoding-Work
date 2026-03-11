import java.util.*;
class LengthofLastword {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int res=lengthOfLastWord(s);
        System.out.print(res);
    }
    public  static int lengthOfLastWord(String s) {
        String word[]=s.trim().split(" ");
        int lastword=word[word.length-1].length();
        
        
        
        return lastword;
    }
}