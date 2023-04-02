import java.util.*;
public class largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of num1,num2 and num3");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int large;
        if((num1>num2) && (num1>num3))
        {
            large=num1;
        }
        else if(num2>num3){
            large=num2;
        }
        else{
            large=num3;
        }
        int small;
        if((num1<num2) && (num1<num3))
        {
            small=num1;
        }
        else if(num2<num3){
            small=num2;
        }
        else{
            small=num3;
        }
        float avg=(float)(num1+num2+num3)/3;
        System.out.println("The Smallest number :"+small);
        System.out.println("The Largest number :"+large);
        System.out.println("The Average of 3 numbers :"+avg);
        sc.close();

    }
}
