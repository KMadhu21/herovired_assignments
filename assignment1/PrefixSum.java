import java.util.*;
class PrefixSum{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a[]=new int[n];
        int prefix[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            a[i]=input.nextInt();
        }
        for(int i=0;i<a.length;i++){
            if(i==0)
                prefix[i]=a[i];
            else    
                prefix[i]=a[i]+prefix[i-1];
        }
        for(int i=0;i<prefix.length;i++)
            System.out.print(prefix[i]+" ");
    }
}