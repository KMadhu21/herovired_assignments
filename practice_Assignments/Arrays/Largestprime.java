import java.util.*;
public class Largestprime {
    public static boolean isPrime(int n)
    {
        if(n<=1)return false;
        for(int i=2;i<=n/2;i++)
        if(n%i==0)return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter array elements separated by space\n");
        String ele=sc.nextLine();
        String elements[]=ele.split(" ");
        int arr[]=new int[elements.length];
        for(int i=0;i<elements.length;i++)
        {
            arr[i]=Integer.parseInt(elements[i]);
        }
        int p=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(isPrime(arr[i]))
            {
                p=Math.max(p,arr[i]);
            }
        }
        System.out.println("The Largest Prime number in given array: "+p);
        sc.close();
    }
}
