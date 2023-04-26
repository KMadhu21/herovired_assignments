/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ListNode temp=lists[i];
            while(temp!=null)
            {
                al.add(temp.val);
                temp=temp.next;
            }
        }
        Collections.sort(al);
        ListNode head=null;
        ListNode tem=null;
        for(int i=0;i<al.size();i++)
        {
            if(i==0)
            {
                head=tem=new ListNode(al.get(i));
            }
            else{
                tem.next=new ListNode(al.get(i));
                tem=tem.next;
            }
        }
        return head;
        
    }
}