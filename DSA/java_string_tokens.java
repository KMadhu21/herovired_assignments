import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(s.isEmpty()){
            System.out.println("0");
        }else{
            String[] tokens = s.split("[ !,?._'@+]+");
            System.out.println(tokens.length);
            for(String t : tokens){
                System.out.println(t);
            }
        }
        scan.close();
    }
}