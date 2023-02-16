package stack;
import java.util.ArrayList;
public class que {

	public static void main(String[] args) {
		ArrayList<Integer>queue=new ArrayList<>();
		System.out.println(isEmpty(queue));
		push(2,queue);
		push(3,queue);
		push(4,queue);
		push(5,queue);
		printqueue(queue);
		System.out.println("Top Element "+top(queue));
		int rv=pop(queue);
		printpop(rv);
		printqueue(queue);

	}
	public static void printqueue(ArrayList<Integer>queue)
	{
		for(int e:queue)
		{
			System.out.print(e+" ");
		}
		System.out.println();
	}
	public static void push(int ele,ArrayList<Integer>queue)
	{
		queue.add(ele);
	}
	public static int pop(ArrayList<Integer>queue)
	{
		if(queue.size()==0)
		{
			return Integer.MAX_VALUE;
		}
		return queue.remove(0);
	}
	public static void printpop(int rv)
	{
		if(rv==Integer.MAX_VALUE)
		{
			System.out.println("queue is empty");
		}
		else {
			System.out.println("poped value is "+rv);
		}
	}
	public static boolean isEmpty(ArrayList<Integer>queue)
	{
		if(queue.size()==0)
		{
			return true;
		}
		else {
			return false;
		}
	}
	public static int top(ArrayList<Integer>queue)
	{
		if(queue.size()==0)
		{
			return -1;
		}
		else
		{
			return queue.get(0);
		}
	}

}
