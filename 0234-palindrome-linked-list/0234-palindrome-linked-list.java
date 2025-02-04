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
    public boolean isPalindrome(ListNode head) {
        // find mid
        ListNode slow = head, fast = head;
        int len = 0;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            len +=2;
        }

        if(fast != null) len++;

        fast = head;
        int count = 0;
        Stack<Integer> st = new Stack<>();
        while(count < len/2) {
            count++;
            st.push(fast.val);
            fast = fast.next;
        }

        if(len%2 != 0)  slow = slow.next;
        while(slow != null) {
            if(slow.val != st.pop()) return false;
            slow = slow.next;
        }

        return true;
    }
}