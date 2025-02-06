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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int len = 0;
        if(head == null || head.next == null) return null;
        while(temp != null) {
            len++;
            temp = temp.next;
        }

        temp = head;
        int count = 0;
        while(temp.next != null) {
            count++;
            if(len/2 == count) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }

        return head;
    }
}