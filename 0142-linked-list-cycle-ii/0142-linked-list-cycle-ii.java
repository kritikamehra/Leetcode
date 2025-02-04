/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode slow = head, fast = head.next;

        while(fast != null && fast.next != null) {
            if(fast == slow) break;
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast == null || fast.next == null) return null;

        fast = head;
        slow = slow.next;
        while(fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}