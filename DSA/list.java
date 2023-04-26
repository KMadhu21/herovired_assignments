import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList<Integer> list=new  ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            list.add(a);
        }
      
        int k=sc.nextInt();
        for(int i=0;i<k;i++)
        {
            String s=sc.next();
            
            if(s.equals("Insert"))
            {
                int p=sc.nextInt();
                int ele=sc.nextInt();
                list.add(p,ele);
            }
            if(s.equals("Delete"))
            {
                int d=sc.nextInt();
                list.remove(d);
            }
        }
        for(int i=0;i<list.size();i++)
        {
           System.out.print(list.get(i)+" ");
        }
    }
    
}