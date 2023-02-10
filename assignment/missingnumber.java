package assignment;
import java.util.*;
public class missingnumber {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n;
	n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	int max=a[0];
	for(int i=1;i<n;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	int temp[]=new int[max+1];
	for(int i:a)
	{
		temp[i]++;
	}
	for(int i=1;i<max+1;i++) {
		if(temp[i]==0)
		{
			System.out.print(i+" ");
		}
	}
	
	}
}
