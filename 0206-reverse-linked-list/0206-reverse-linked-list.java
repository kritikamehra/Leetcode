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
        if(head == null || head.next == null) return head;
        ListNode prev = new ListNode(), curr = head;
        prev.next = head;

        while(curr.next != null) {
            ListNode forw = curr.next;
            curr.next = forw.next;
            forw.next = prev.next;
            prev.next = forw;
        }

        return prev.next;
    }
}