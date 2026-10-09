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
import java.util.ArrayList;

public class Solution {
    public ListNode reverseList(ListNode head) {

        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;

        // Store all values
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        // Put values back in reverse order
        temp = head;
        int i = list.size() - 1;

        while (temp != null) {
            temp.val = list.get(i);
            i--;
            temp = temp.next;
        }

        return head;
    }
}