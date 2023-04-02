import java.util.*;
public class swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value A : ");
        int numA=sc.nextInt();
        System.out.println("Enter the value B : ");
        int numB=sc.nextInt();
        int temp=numA;
        numA=numB;
        numB=temp;
        System.out.println("numA = "+numA+" numB = "+numB);
        sc.close();
        


    }
}
