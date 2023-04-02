import java.util.*;
public class frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter array1 elements\n");
        String A_element=sc.nextLine();
        System.out.println("\nEnter array2 elements\n");
        String B_element=sc.nextLine();
        String A_elements[]=A_element.split(" ");
        String B_elements[]=B_element.split(" ");
        int A[]=new int[A_elements.length];
        int B[]=new int[B_elements.length];
        for(int i=0;i<A_elements.length;i++)
        {
            A[i]=Integer.parseInt(A_elements[i]);
        }
        for(int i=0;i<B_elements.length;i++)
        {
            B[i]=Integer.parseInt(B_elements[i]);
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<B.length;i++)
        {
            if(!hm.containsKey(B[i]))
            hm.put(B[i],0);
        }
        for(int i=0;i<A.length;i++)
        {
            if(hm.containsKey(A[i]))
            hm.put(A[i],hm.get(A[i])+1);
        }
        for(Integer ele:hm.keySet()){
            System.out.println("Frequency of "+ele+" : "+hm.get(ele));
        }
        sc.close();
    }
}
