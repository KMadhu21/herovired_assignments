import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        while(tc>0 && sc.hasNextLine()){
            String pattern = sc.nextLine();           
              try{
                  Pattern p = Pattern.compile(pattern);
                  System.out.println("Valid");
              }
              catch(PatternSyntaxException e){
                  System.out.println("Invalid");
              }  
        }
        sc.close();
        
    }
}