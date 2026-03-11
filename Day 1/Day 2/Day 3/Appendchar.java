import java.util.*;
class Appendchar {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String t=sc.nextLine();
    int res=appendCharacters(s,t);
    System.out.print(res);
    }
    
    public  static int appendCharacters(String s, String t) {
        int i=0,j=0;
        // int count=0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                j++;
            }
                i++;
            
            
            
        }
        return t.length()-j;
    }
}
