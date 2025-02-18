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

        HashMap<Node,Node> mp = new HashMap<>();

        // copy next pointers
        while(temp != null) {
            Node newnode = new Node(temp.val);
            mp.put(temp,newnode);
            dummy.next = newnode;
            dummy = newnode;
            temp = temp.next;
        }

        temp = head;

        while(temp != null) {
            Node newnode = mp.get(temp);
            if(temp.random == null)
                newnode.random = null;
            else {
                newnode.random = mp.get(temp.random);
            }
            temp = temp.next;
        }

        return ans.next;
    }
}