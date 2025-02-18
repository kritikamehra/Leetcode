/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node ans = new Node(0);
        Node dummy = ans;
        Node temp = head;
        
        // head null
        if(head == null) return null;

        Node next = null;
        // copy next pointers
        while(temp != null) {
            Node newnode = new Node(temp.val);
            // next = temp.next;
            dummy.next = newnode;
            dummy = newnode;
            temp = temp.next;
        }

        //set next pointers
        temp = head;
        Node t = ans.next;
    
        while(temp != null) {
            next = temp.next;
            temp.next = t;
            temp = next;
            
            next = t.next;
            t.next = temp;
            t = next;
        }

        //add random pointer
        temp = head;
        while(temp != null) {
            if(temp.next != null) {
                if(temp.random == null)
                    temp.next.random = null;
                else {
                    temp.next.random = temp.random.next;
                }
                temp = temp.next.next;
            }
        }


        //remove next pointers
        temp = head;
        next = head.next;
        while(temp != null) {
            temp.next = next.next;
            temp = temp.next;
            if(next.next != null)
            next.next = temp.next;
            next = next.next;
        }

        return ans.next;
    }
}