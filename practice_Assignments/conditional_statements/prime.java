import java.util.*;
public class prime {
    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value :");
        int n=sc.nextInt();
        if(isprime(n)){
            System.out.println("The given number "+n+" is a prime number");
        }
        else{
            System.out.println("The given number "+n+" is NOT a prime number");
        }
        sc.close();


    }
}
