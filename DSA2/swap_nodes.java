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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode t1=head;
        ListNode t2=head.next;
        while(t1!=null && t2!=null)
        {
            int temp=t1.val;
            t1.val=t2.val;
            t2.val=temp;
            if(t2.next!=null){
                t1=t2.next;
            }
            else{
                return head;
            }
            if(t1.next!=null){
                t2=t1.next;
            }
            else{
                return head;
            }
        }
        return head;

    }
}