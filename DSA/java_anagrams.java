import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        a=a.toUpperCase();
        b=b.toUpperCase();
       
        StringBuilder sb = new StringBuilder(b);
       
        for(int i=0;i<a.length();i++){
           for(int j=0;j<sb.length();j++){
               if(a.charAt(i)==sb.charAt(j)){
                  sb.setCharAt(j, '*');
                  break;
               }
               
           }
       }
       
       boolean flag=true;
       for(int i=0;i<sb.length();i++){
           if(sb.charAt(i)!='*'){
               flag=false;
               break;
           }
       }
       
       if(flag==true && sb.length()==a.length()){
           return true;
       }
         
    return false;
    }
  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}