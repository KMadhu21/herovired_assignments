package assignment;
import java.util.*;
public class unique {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		HashMap<Integer,Integer>hm=new HashMap<>();
		ArrayList<Integer>al=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			if(!hm.containsKey(a[i]))
			{
				hm.put(a[i],1);
				al.add(a[i]);	
			}
		}
		Collections.sort(al);
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+" ");
		}
	}
}
