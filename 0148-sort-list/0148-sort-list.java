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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode mid = getMid(head);
        ListNode leftlist = head;
        ListNode rightlist = mid.next;
        mid.next = null;

        ListNode sortedLeft = sortList(leftlist);
        ListNode sortedRight = sortList(rightlist);
        ListNode mergeHead = merge(sortedLeft, sortedRight);

        return mergeHead;
    }

    public ListNode getMid(ListNode head) {

        if(head == null || head.next == null) return head; 
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode merge(ListNode left, ListNode right) {
        ListNode ans = new ListNode();
        ListNode curr = ans;
        ListNode t1 = left, t2 = right;
        if(t1 == null) return t2;
        if(t2 == null) return t1;

        while(t1 != null && t2 != null) {
            if(t1.val <= t2.val) {
                curr.next = t1;
                curr = curr.next;
                t1 = t1.next;
            }

            else {
                curr.next = t2;
                curr = curr.next;
                t2 = t2.next;
            }
        }

        while(t1 != null) {
            curr.next = t1;
            curr = curr.next;
            t1 = t1.next;
        }

        while(t2 != null) {
            curr.next = t2;
            curr = curr.next;
            t2 = t2.next;
        }

        return ans.next;
    }
}