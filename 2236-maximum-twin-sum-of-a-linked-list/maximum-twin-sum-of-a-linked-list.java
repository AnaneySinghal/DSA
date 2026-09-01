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
        ListNode t=head;
        ListNode d1=new ListNode(-1);
        ListNode t1=d1;
        ListNode d2=new ListNode(-1);
        ListNode t2=d2;

        while(t!=null){
            t1.next=t;
            t=t.next;
            t1=t1.next;
            t2.next=t;
            t=t.next;
            t2=t2.next;

        }
        t1.next=null;

        ListNode h1=d1.next;
        ListNode h2=reverseList(d2.next);
        int curr_sum=0;
            int max_sum=-1;

        while(h1!=null && h2!=null){
            
            curr_sum=h1.val+h2.val;
            max_sum=Math.max(max_sum,curr_sum);
            h1=h1.next;
            h2=h2.next;

        }
        return max_sum;
        
        
    }
}