import java.util.*;
class Duplicates{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        Node head1=new Node(input.nextInt());
        Node head=head1;
        for(int i=1;i<n;i++){
            head1.next=new Node(input.nextInt());
            head1=head1.next;
        }
        ArrayList<Integer> list=new ArrayList<>();
        while(head!=null){
            if(list.contains(head.data)){
                head=head.next;
                continue;
            }
            else
                list.add(head.data);
            head=head.next;
        }
        Node temp=new Node(list.get(0));
        Node res=temp;
        for(int i=1;i<list.size();i++){
            temp.next=new Node(list.get(i));
            temp=temp.next;
        }
        while(res!=null){
            System.out.print(res.data+" ");
            res=res.next;
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