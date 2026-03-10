import java.util.*;
public class replaceGreatestRight {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
       // replaceGreatesRight obj=new replaceGreatesRight();
        int[] res=replaceElements(arr);
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }
    }
    public static int[] replaceElements(int[] arr) {
        int maxright=-1;
        for(int i=arr.length-1;i>=0;i--){
            int temp=arr[i];
            arr[i]=maxright;
        
        if(temp>maxright){
            maxright=temp;
        }
     }
        return arr;
    }
}

