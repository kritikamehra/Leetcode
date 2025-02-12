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
        
        if(k==0 || head == null || head.next == null) return head;

        int n = 0;
        ListNode temp = head;

        while(temp != null) {
            n++;
            temp = temp.next;
        }

        k = k%n;
        if(k == n || k == 0) return head;
        int rem = 0;
        ListNode prev = temp;
        temp = head;
        while(rem < n-k) {
            rem++;
            prev = temp;
            temp = temp.next;
        }

        ListNode newhead = temp;
        prev.next = null;

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = head;

        return newhead;
    }
}