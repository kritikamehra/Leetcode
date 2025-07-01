/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        if(head1 == null || head2 == null) return null;
        ListNode temp1 = head1, temp2 = head2;

        while(temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
            if(temp1 == temp2) return temp1;
            if(temp1 == null) temp1 = head2;
            if(temp2 == null) temp2 = head1;
        }
        return temp1;
    }
}