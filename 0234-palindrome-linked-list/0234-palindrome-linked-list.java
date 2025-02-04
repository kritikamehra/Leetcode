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
        if(head == null || head.next == null)    return head;

        ListNode front = head.next;
        ListNode temp = reverseList(head.next);
        front.next = head;
        head.next = null;
        
        return temp;
    }
    public boolean isPalindrome(ListNode head) {
        // find mid
        ListNode slow = head, fast = head;
        int len = 0;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode temphead = slow;
        slow = reverseList(slow);

        fast = head;
        while(fast != temphead && slow != null) {
            if(fast.val != slow.val) return false;
            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }
}