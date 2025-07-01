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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1, temp2 = l2;
        int sum = 0, carry = 0;
        ListNode dummy = new ListNode();
        ListNode prev = dummy;

        while(temp1 != null && temp2 != null) {
            sum = temp1.val + temp2.val + carry;
            ListNode newnode = new ListNode(sum%10);
            prev.next = newnode;
            prev = newnode;
            carry = sum/10;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

         while(temp1 != null) {
            sum = temp1.val + carry;
            ListNode newnode = new ListNode(sum%10);
            prev.next = newnode;
            prev = newnode;
            carry = sum/10;
            temp1 = temp1.next;
        }

         while(temp2 != null) {
            sum = temp2.val + carry;
            ListNode newnode = new ListNode(sum%10);
            prev.next = newnode;
            prev = newnode;
            carry = sum/10;
            temp2 = temp2.next;
        }

        if(carry != 0) {
            ListNode newnode = new ListNode(carry);
            prev.next = newnode;
        }

        return dummy.next;
    }
}