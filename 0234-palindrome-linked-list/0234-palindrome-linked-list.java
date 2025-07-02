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
    public ListNode reverseLL(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode prev = new ListNode(), curr = head;
        prev.next = curr;

        while(curr.next != null) {
            ListNode forw = curr.next;
            curr.next = forw.next;
            forw.next = prev.next;
            prev.next = forw;
        }

        return prev.next;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        int len = 0;

        while(curr != null) {
            len++;
            curr = curr.next;
        }

        if(len == 1) return true;
        
        int midlen = len/2;

        ListNode prev = null;
        curr = head;
        int count = 0;
        while(count < midlen) {
            count++;
            prev = curr;
            curr = curr.next;
        }

        System.out.print(curr.val);
        ListNode reverseHead = reverseLL(curr);
        prev.next = reverseHead;
        // if(len%2 != 0) prev = prev.next;
        
        curr = head;
        

        while(reverseHead != null) {
            if(curr.val != reverseHead.val && curr != prev.next) return false;
            curr = curr.next;
            reverseHead = reverseHead.next;
        }

        return true;
    }
}