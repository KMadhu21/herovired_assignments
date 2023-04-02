import java.util.*;
public class asc_desc {
    public static void Reverse(int arr[]){
        int i=0,j=arr.length-1;
        while(i<=j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
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
        Arrays.sort(arr);
        System.out.println("The elements in ascending Order:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        Reverse(arr);
        System.out.println("\nThe elements in descending Order:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();

}    
}
