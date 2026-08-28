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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        ListNode d1=new ListNode(-1);
        ListNode d2=new ListNode(-1);
        ListNode t1=d1;
        ListNode t2=d2;

        while(temp!=null){
            t1.next=temp;
            temp=temp.next;
            t1=t1.next;
            
            t2.next=temp;
          if(temp!=null) temp=temp.next;
          t2=t2.next;
        }
        t1.next=d2.next;
       
        return d1.next;
        
    }
}