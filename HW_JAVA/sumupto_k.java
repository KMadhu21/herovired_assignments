package subarray;
import java.util.*;

public class sumupto_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int pre[]=new int[n];
		pre[0]=a[0];
		for(int i=1;i<n;i++)
		{
			pre[i]=pre[i-1]+a[i];
		}
		ArrayList<Integer>al=new ArrayList<>();
		al.add(pre[k-1]);
		for(int i=k;i<n;i++)
		{
			int r=pre[i]-pre[i-k];
			al.add(r);
		}
		System.out.println(al);
	}

}
