package assignment;
import java.util.*;
public class inventoryStoreArrays {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter no of products : ");
		int n = sc.nextInt();
		HashMap<String,List> hm = new HashMap<>();
		for(int i = 0 ; i < n  ; i++ ) {
			System.out.println("Enter productName,  Specification,  cost,  count : \n");
			sc.nextLine();
			String line  = sc.nextLine();
			String[] arr = line.split(" ");
			ArrayList al = new ArrayList() ;
			String name = arr[0];
			String spec = arr[1];
			double cost = Double.parseDouble(arr[2]);
			int count = Integer.parseInt(arr[3]);
			al.add(spec);
			al.add(cost);
			al.add(count);
			hm.put(name, al);
		}
		boolean f = true;
		while(f != false) {
			System.out.println("1.Product List\n2.Product count\n3.Product details\n4.Update Inventory\n5.Edit product details\n6.Exit\n");
			System.out.println("Enter your choice ");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("*************************");
				product_List(hm);
				System.out.println("*************************");
			}else if(choice == 2) {
				System.out.println("*************************");
				product_count(hm);
				System.out.println("*************************");
			}else if(choice == 3) {
				System.out.println("*************************");
				product_details(hm);
				System.out.println("*************************");
			}else if(choice == 4) {
				System.out.println("*************************");
				update_Inventory(hm);
				System.out.println("*************************");
			}else if(choice == 5) {
				System.out.println("*************************");
				edit_product(hm);
				System.out.println("*************************");
			}else if(choice  == 6) {
				f = false;
			}else {
					System.out.println("Enter choice between 1 - 6 ");
			}
			
		}
	}
	public static void product_List(Map<String,List> hm) {
		int i = 1;
		for(String st : hm.keySet()) {
			System.out.println(i + " "+st);
			i++;
		}
	}
	public static void update_Inventory(Map<String,List> hm) {
		System.out.println("1. Add poduct");
		System.out.println("2. Delete product");
		System.out.println("Enter your choice");System.out.println();
		sc.nextLine();
		int n = sc.nextInt();
		if(n == 1) {
			System.out.println("Enter productName,Specification,cost,count : ");
			sc.nextLine();
			String t = sc.nextLine();
			String []arr = t.split(" ");
			String name = arr[0];
			String spec = arr[1];
			double cost = Double.parseDouble(arr[2]);
			int count = Integer.parseInt(arr[3]);
			ArrayList al = new ArrayList();
			al.add(spec);
			al.add(cost);
			al.add(count);
			hm.put(name, al);
		}else {
			System.out.println("Enter product name to delete product : ");
			sc.nextLine();
			String name = sc.nextLine();
			if(hm.containsKey(name)) {
				hm.remove(name);
				System.out.println("Product removed Successfully");
			}else {
				System.out.println("Product Not Found");
			}
		}
	}
	public static void edit_product(Map<String,List> hm) {
		System.out.println("Enter product name : ");
		sc.nextLine();
		String name = sc.nextLine();
		if(hm.containsKey(name)) {
			System.out.println("\n1.Specification\n2.Cost\n3.Product count");
			System.out.println("Enter your choice to edit product ");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("Enter product specification ");
				String st = sc.nextLine();
				List list = hm.get(name);
				list.remove(0);
				list.add(0, st);
				hm.put(name, list);
			}else if(choice == 2) {
				System.out.println("Enter product cost ");
				double cost = sc.nextDouble();
				List al = hm.get(name);
				al.remove(1);
				al.add(1, cost);
				hm.put(name,al);
			}else {
				System.out.println("\nEnter product count ");
				int count = sc.nextInt();
				List al = hm.get(name);
				al.remove(2);
				al.add(count);
				hm.put(name,al);
			}
			return;
		}else {
			System.out.println("Product not found");
		}
	}
	public static void product_count(Map<String,List> hm) {
		System.out.println("Enter product name");
		sc.nextLine();
		String name = sc.nextLine();
		if(hm.containsKey(name)) {
			List al = hm.get(name);
			System.out.println("count of "+name+" is "+al.get(2));
		}else {
			System.out.println("Product not found");
		}
	}
	public static void product_details(Map<String,List> mp) {
		System.out.println("Enter product name");
		sc.nextLine();
		String name = sc.nextLine();
		if(mp.containsKey(name)) {
			System.out.println("Product Name : "+name);
			System.out.println("Product Specification : "+mp.get(name).get(0));
			System.out.println("Product Cost : "+mp.get(name).get(1));
			System.out.println("Product count : "+mp.get(name).get(2));
		}else {
			System.out.println("Product not found");
		}
	}
}