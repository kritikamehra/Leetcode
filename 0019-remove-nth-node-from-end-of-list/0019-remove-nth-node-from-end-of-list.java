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
        ListNode temp = head;
        int len = 0;
        while(temp != null) {
            temp = temp.next;
            len++;
        }
        n = len-n;
        if(n == 0)  return head.next;
        
        int pos = 0;
        temp = head;
        while(temp != null && pos < n-1) {
            temp = temp.next;
            pos++;
        }

        temp.next = temp.next.next;

        return head;

    }
}