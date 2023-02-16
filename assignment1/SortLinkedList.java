import java.util.*;
class SortLinkedList{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        Node node1=new Node(input.nextInt());
        Node head=node1;
        for(int i=1;i<n;i++){
            node1.next=new Node(input.nextInt());
            node1=node1.next;
        }
        int m=input.nextInt();
        Node node2=new Node(input.nextInt());
        Node temp=node2;
        for(int i=1;i<m;i++){
            node2.next=new Node(input.nextInt());
            node2=node2.next;
        }
        int a[]=new int[n+m];
        int x=0;
        while(head!=null){
            a[x++]=head.data;
            head=head.next;
        }
        while(temp!=null){
            a[x++]=temp.data;
            temp=temp.next;
        }
        Arrays.sort(a);
        Node t=new Node(a[0]);
        Node node=t;
        for(int i=1;i<a.length;i++){
            t.next=new Node(a[i]);
            t=t.next;
        }
        while(node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
    }
    static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
}