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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int len = 0;
        while(curr != null) {
            len++;
            curr = curr.next;
        }

        len = len-n;
        if(len == 0) return head.next;
        curr = head;

        while(curr != null) {
            len--;
            if(len == 0) {
                curr.next = curr.next.next;
                break;
            }
            curr = curr.next;
        }

        return head;
    }
}