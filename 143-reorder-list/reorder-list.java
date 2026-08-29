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
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode curr=head;
        ListNode prev=null;
        ListNode fwd=null;

        while(curr!=null){
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode a=head;
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode b=slow.next;
        slow.next=null;
        
        ListNode d1=new ListNode(-1);
        ListNode t1=d1;
        b=reverse(b);
        
        while(a!=null){
            t1.next=a;
            a=a.next;
            t1=t1.next;
            t1.next=b;
            if(b!=null)b=b.next;
            t1=t1.next;
        }
        
        
    }
}