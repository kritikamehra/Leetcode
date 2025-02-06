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

        ListNode node = head;
        
        ListNode sortedHead = sortList(head.next);
        ListNode temp = sortedHead, prev = head;
        
        // check first node
        if(temp != null && head.val <= temp.val) {
            head.next = sortedHead;
            return head;
        }

        //traverse until found just greater ele
        while(temp != null && temp.val < node.val) {
            prev = temp;
            temp = temp.next;
        }

        //insert in the linkedlist
        prev.next = node;
        node.next = temp;

        return sortedHead;
    }
}