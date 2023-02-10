package assignment;
import java.util.*;
public class inventoryStoreClassObjects {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("No of products\n ");
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<inventoryProduct>al = new ArrayList<>();
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Enter productName,Specification,cost,count : \n");
			String line = sc.nextLine();
			String []list = line.split(" ");
			String name = list[0];
			String spec = list[1];
			double cost = Double.parseDouble(list[2]);
			int count = Integer.parseInt(list[3]);
			inventoryProduct product = new inventoryProduct(name,spec,cost,count);
			al.add(product);
			System.out.println();
		}
		boolean f = true;
		while(f != false) {
			System.out.println("1.Product List\n2.Product count\n3.Product details\n4.Update Inventory\n5.Edit product details\n6.Exit\n");
			System.out.println("Enter your choice ");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("*************************");
				product_list(al);
				System.out.println("*************************");
			}else if(choice == 2) {
				System.out.println("*************************");
				product_count(al);
				System.out.println("*************************");
			}else if(choice == 3) {
				System.out.println("*************************");
				product_details(al);
				System.out.println("*************************");
			}else if(choice == 4) {
				System.out.println("*************************");
				update_inventory(al);
				System.out.println("*************************");
			}else if(choice == 5) {
				System.out.println("*************************");
				edit_product(al);
				System.out.println("*************************");
			}else if(choice  == 6) {
				f = false;
			}else {
					System.out.println("Enter your  choice between 1 - 6 only");
					System.out.println("*************************");
			}
			
		}
		sc.close();
	}
	public static void product_details(List<inventoryProduct> list) {
		System.out.println("\nEnter product name to get details : ");
		sc.nextLine();
		String name = sc.nextLine();
		for(inventoryProduct product: list) {
			if(product.get_Product().compareToIgnoreCase(name) == 0) {
				product.inventoryProductDetails();
				return;
			}
		}
		System.out.println("\nProduct not found");
	}
	public static void product_count(List<inventoryProduct> list) {
		System.out.print("\nEnter product name to get count : ");
		sc.nextLine();
		String name = sc.nextLine();
		boolean f = false;
		for(inventoryProduct product: list) {
			if((product.get_Product()).compareToIgnoreCase(name) == 0) {
				System.out.println("Product count of "+product.get_Product() + " is "+product.productCount());
				f = true;
				break;
			}
		}
		if(!f)
		System.out.println("Product not found");
	}
	public static void edit_product(ArrayList<inventoryProduct> list) {
		System.out.println("Enter product name : ");
		sc.nextLine();
		String pname = sc.nextLine();
		for(inventoryProduct p: list) {
			if(p.get_Product().compareToIgnoreCase(pname) == 0) {
				System.out.println("\n1.Specification\n2.Cost\n3.Product count");
				System.out.println("Enter your choice to edit product ");
				int ch = sc.nextInt();
				if(ch == 1) {
					System.out.println("Enter product specification ");
					sc.nextLine();
					String st = sc.nextLine();
					p.edit_Update(st);
				}else if(ch == 2) {
					System.out.println("Enter product cost ");
					double cost = sc.nextDouble();
					p.edit_Update(cost);
				}else {
					System.out.println("\nEnter product count ");
					int count = sc.nextInt();
					p.edit_Update(count);
				}
				return;
			}System.out.println();
		}
		System.out.println("\nProduct not found");
	}
	public static void product_list(ArrayList<inventoryProduct> list) {
		if(list.size() == 0) {
			System.out.println("Empty ... ");
			return;
		}
		int i = 1 ;
		for(inventoryProduct product:list)
			System.out.println((i++) + " " +product.get_Product());
		System.out.println();
	}
	public static void update_inventory(ArrayList<inventoryProduct> list) {
		System.out.println("1. Add poduct");
		System.out.println("2. Delete product");
		System.out.println("Enter your choice");
		sc.nextLine();
		int n = sc.nextInt();
		if(n == 1) {
			System.out.println("Enter product name,Specification,cost,count : ");
			sc.nextLine();
			String t = sc.nextLine();
			String []arr = t.split(" ");
			String name = arr[0];
			String spec = arr[1];
			double cost = Double.parseDouble(arr[2]);
			int count = Integer.parseInt(arr[3]);
			inventoryProduct p1 = new inventoryProduct(name,spec,cost,count);
			list.add(p1);
		}else {
			System.out.println("Enter name to delete product : ");
			sc.nextLine();
			String name = sc.nextLine();
			int i = 0;
			for(inventoryProduct product: list) {
				if((product.get_Product()).compareToIgnoreCase(name) == 0) {
					break;
				}
				i++;
			}
			if(i == list.size())
				System.out.println("product not found");
			else {
				list.remove(i);
				System.out.println("Product removed successfully");
			}
		}
	}
}
class inventoryProduct{
	double cost;
	int count;
	String spec;
	String name;
	inventoryProduct(String name,String spec,double cost,int count){
		this.cost = cost;
		this.count = count;
		this.name = name;
		this.spec = spec;
	}
	public int productCount() {
		return this.count;
	}
	public void inventoryProductDetails() {
		System.out.println("product name : "+this.name+"\n"+"product Specification : "+this.spec+"\n"+"product cost : "+this.cost+"\n"+"product count : "+this.count);
	}
	public void edit_Update(String spec) {
		this.spec = spec;
	}
	public void editProductName(String name) {
		this.name = name;
	}
	public String get_Product() {
		return this.name;
	}
	public void edit_Update(int count) {
		this.count = count;
	}
	public void edit_Update(double cost) {
		this.cost = cost;
	}
}
