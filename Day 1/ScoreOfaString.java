import java.util.*;
public class ScoreOfaString {
   public static void main(String[] args){
    Scanner st=new Scanner(System.in);
    String s=st.nextLine();
   ScoreOfaString obj=new ScoreOfaString();
    int res= obj.scoreOfString( s) ;
    System.out.print(res);
   }
    public int scoreOfString(String s) {
        char[] ch=s.toCharArray();
       int sum=0;
       int sum1=0;
        for(int i=0;i<ch.length-1;i++){
           // ch[i]=int(arr[i]);
             
            sum=Math.abs(ch[i+1]-ch[i]);
            sum1+=sum;
            
        }
        return sum1;
        
    }
}

