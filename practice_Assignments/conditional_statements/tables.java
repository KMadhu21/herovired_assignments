import java.util.*;
class tables{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Take a input num : ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" X "+i+" = "+(n*i));
        }
        sc.close();
    }
}