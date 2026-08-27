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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=slow.next;
        slow.next=null;
        head=sortList(head);
        head2=sortList(head2);
        return merge(head,head2);

    }
    public ListNode merge(ListNode head1 ,ListNode head2){
        ListNode temp1=head1;
        ListNode temp2=head2;
        ListNode dummy =new ListNode(-1);
        ListNode temp3=dummy;

        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                temp3.next=temp1;
                temp1=temp1.next;
            }
            else{
                temp3.next=temp2;
                temp2=temp2.next; 
            }
            temp3=temp3.next;
        }
        if(temp1==null) temp3.next=temp2;
        else temp3.next=temp1;
        return dummy.next;
    }
}