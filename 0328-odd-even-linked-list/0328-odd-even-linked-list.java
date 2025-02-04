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
        if(head == null || head.next == null) return head;

        ListNode oh = head, eh = head.next, et = eh, ot = oh;

        while(ot.next != null && et.next != null) {
            if(et.next != null) {
                ot.next = et.next;
                ot = ot.next;
            }

            if(ot.next != null) {
                et.next = ot.next;
                et = et.next;
            }
        }

        et.next = null;
        ot.next = eh;

        return oh;
    }
}