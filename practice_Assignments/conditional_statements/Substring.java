import java.util.*;
 class Substring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String :");
        String s=sc.next();
        System.out.print("Starting index :");
        int start=sc.nextInt();
        System.out.print("Ending index:");
        int end=sc.nextInt();
        System.out.println("subString of "+s+" from "+start+" to "+end+" is: "+s.substring(start, end+1));
        sc.close();
    }
}