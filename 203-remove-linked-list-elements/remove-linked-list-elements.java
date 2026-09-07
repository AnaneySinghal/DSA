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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        ListNode dummy=new ListNode(-1);
        ListNode t1=dummy;
        ListNode t2=head;

        while(t2!=null){
            if(t2.val!=val){
                t1.next=t2;
                t1=t1.next;
                t2=t2.next;
            }
            else{
                t2=t2.next;
            }
        }
        t1.next=t2;
        return dummy.next;
        
    }
}