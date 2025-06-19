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
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null) return head;
        
        ListNode temp = head;
        int len = 0;
        while(temp != null) {
            len++;
            temp = temp.next;
        }

        k =  k % len;

        if(len == 1) return head;
        if(k == 0) return head;

        ListNode newHead = head;
        ListNode prev = null;
        temp = head;
        int cnt = 0;

        while(cnt < len-k) {
            prev = temp;
            temp = temp.next;
            cnt++;
        }

        newHead = temp;
        prev.next = null;

        while(temp != null && temp.next != null) {
            temp = temp.next;
        }

        temp.next = head;

        return newHead;
    }
}