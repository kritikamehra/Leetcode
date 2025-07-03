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
    // public ListNode reverse(ListNode head, int k) {
    //   if(head == null || head.next == null) return head;
    // 
    //     ListNode prev = new ListNode();
    //     ListNode curr = head;
    //     prev.next = curr;

    //     int count = 0;

    //     while(curr.next != null) {
    //         if(count == k) break;
    //         ListNode forw = curr.next;
    //         curr.next = forw.next;
    //         forw.next = prev.next;
    //         prev.next = forw;
    //         count++;
    //     }

    //     return prev.next;
    // }

     public ListNode reverse(ListNode head, int k) {
        ListNode prev = null;
        ListNode curr = head;
        while (k-- > 0 && curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public int getLen(ListNode head) {
        if(head == null) return 0;
        if(head.next == null) return 1;

        int count = 0;
        ListNode temp = head;

        while(temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        if(head == null || head.next == null) return head; 
        if(k == 1) return head;
        int len = getLen(head);

        if(k == len) return reverse(head, k);

        ListNode curr = head;
        ListNode ans = new ListNode();
        ans.next = head;
        ListNode dummy = ans;
        ListNode next = null;

        while(k <= len) {
            ListNode temp = curr;
            next = curr;
            int count = 0;
            while(count < k && next != null) {
                count++;
                next = next.next;
            }

            ListNode prev = temp;
            if(count < k) prev = curr;
            else {
                prev = reverse(curr, k);
            }
            dummy.next = prev;
            temp.next = next;;
            dummy = temp;
            curr = next;
            len-=k;
        }

        return ans.next;
    }
}