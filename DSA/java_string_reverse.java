import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int i=0;
        int j=str.length()-1;
        while(i<=j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                System.out.println("No");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("Yes");       
        sc.close(); 
    }
}