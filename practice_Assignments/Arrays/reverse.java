import java.util.*;
public class reverse {
    public static void Reverse(int arr[]){
        int i=0,j=arr.length-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
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
        Reverse(arr);
        System.out.println("Reversed Elements are:");
        for(int i=0;i<arr.length;i++)
        {
           System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
