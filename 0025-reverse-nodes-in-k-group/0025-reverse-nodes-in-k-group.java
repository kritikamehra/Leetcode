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
    public int calclength(ListNode head) {
        int len = 0;
        ListNode temp = head;

        while(temp != null) {
            len++;
            temp = temp.next;
        }

        return len;
    }
    public ListNode reverse(ListNode root, int k) {
        ListNode temp = root;
        ListNode prev = null;
        int count = 0;

        while(temp != null && count < k) {
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
            count++;
        }

        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1) return head;
        // length
        int len = calclength(head);
        if(k > len) return head;
        ListNode ans = new ListNode();
        ListNode dummy = ans;
        ans.next = head;
        ListNode temp = head;
        ListNode next = null;
        int i = 0;
        //run till i < len
        while(i < len) {
            ListNode curr = temp;
            next = temp;
            int count = 0;
            while(next != null && count < k) {
                next = next.next;
                count++;
            }
            
            ListNode prev = temp;
            if(count < k) next = temp.next;
            else 
                prev = reverse(curr, k);
            
            dummy.next = prev;
            curr.next = next;
            dummy = curr;
            temp = next;
            i+=k;
        }

        return ans.next;
    }
}