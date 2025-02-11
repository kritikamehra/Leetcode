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
    public ListNode sum(ListNode l1, ListNode l2) {
        ListNode temp1 = l1, temp2 = l2;
        ListNode ans = new ListNode();
        ListNode dummy = ans;
        int sum = 0, carry = 0;
        while(temp1 != null && temp2 != null) {
            sum = temp1.val + temp2.val + carry;
            carry = sum/10;
            ListNode newnode = new ListNode(sum%10);
            ans.next = newnode;
            ans = newnode;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        while(temp1 != null) {
            sum = temp1.val + carry;
            carry = sum/10;
            ListNode newnode = new ListNode(sum%10);
            ans.next = newnode;
            ans = newnode;
            temp1 = temp1.next;
        }

        while(temp2 != null) {
            sum = temp2.val + carry;
            carry = sum/10;
            ListNode newnode = new ListNode(sum%10);
            ans.next = newnode;
            ans = newnode;
            temp2 = temp2.next;
        }

        if(carry != 0) {
            while(carry != 0) { 
                ListNode newnode = new ListNode(carry%10);
                ans.next = newnode;
                ans = newnode;
                carry = carry/10;
            }
        }
        return dummy.next;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return sum(l1,l2);
    }
}