import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> alist = new ArrayList<ArrayList<Integer>>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++)
        {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int d = sc.nextInt();
        for(int j = 0;j<d;j++)
        {
            int a = sc.nextInt();
            list.add(a);
        }
        alist.add(list);
    }
    int queries = sc.nextInt();
    for(int k = 0; k<queries; k++){
        int l, r;
        l = sc.nextInt();
        r = sc.nextInt();
        try{
           System.out.println(alist.get(l-1).get(r-1)); 
        } catch (IndexOutOfBoundsException e){
            System.out.println("ERROR!");
        }
    }
    sc.close();
    }
}