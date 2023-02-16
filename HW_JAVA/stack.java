package stack;
import java.util.*;
public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>stack=new ArrayList<>();
		//System.out.println(isEmpty(stack));
		push(2,stack);
		push(3,stack);
		push(4,stack);
		push(5,stack);
		printstack(stack);
		//System.out.println(top(stack));
		//printstack(stack);
//		System.out.println(isEmpty(stack));
//		
		int rv=pop(stack);
		printpop(rv);
		printstack(stack);
//		

	}
	public static void printstack(ArrayList<Integer>stack)
	{
		for(int e:stack)
		{
			System.out.print(e+" ");
		}
		System.out.println();
	}
	public static void push(int ele,ArrayList<Integer>stack)
	{
		stack.add(ele);
	}
	public static int pop(ArrayList<Integer>stack)
	{
		if(stack.size()==0)
		{
			return Integer.MAX_VALUE;
		}
		return stack.remove(stack.size()-1);
	}
	public static void printpop(int rv)
	{
		if(rv==Integer.MAX_VALUE)
		{
			System.out.println("stack is empty");
		}
		else {
			System.out.println("poped value is "+rv);
		}
	}
	public static boolean isEmpty(ArrayList<Integer>stack)
	{
		if(stack.size()==0)
		{
			return true;
		}
		else {
			return false;
		}
	}
	public static int top(ArrayList<Integer>stack)
	{
		if(stack.size()==0)
		{
			return -1;
		}
		else
		{
			return stack.get(stack.size()-1);
		}
	}

}
