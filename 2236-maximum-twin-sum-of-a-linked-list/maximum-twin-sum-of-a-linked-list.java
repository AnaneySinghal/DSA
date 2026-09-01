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
      public ListNode reverseList(ListNode head) {
        ListNode current=head;
        ListNode prev=null;
        ListNode fwd=null;

        while(current!=null){
            fwd=current.next;
            current.next=prev;
            prev=current;
            current=fwd;
        }
        return prev;
        
    }


    public int pairSum(ListNode head) {
        ListNode h1=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode h2=reverseList(slow);
       
        

        int max_sum=-1;
        while(h2!=null){
            max_sum=Math.max(max_sum,(h1.val+h2.val));
            h1=h1.next;
            h2=h2.next;

        }
        return max_sum;
        
        
    }
}