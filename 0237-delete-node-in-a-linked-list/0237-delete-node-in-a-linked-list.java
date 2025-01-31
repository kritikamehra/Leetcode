/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp = node;
        if(temp.next.next != null) {
            temp.val = temp.next.val;
            temp.next = temp.next.next;
        }
        else {
            temp.val = temp.next.val;
            temp.next = null;
        }
    }
}