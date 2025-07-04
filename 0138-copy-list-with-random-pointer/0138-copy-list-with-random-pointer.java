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
    
        Node temp = head;
        while(temp != null) {
            Node newnode = new Node(temp.val);
            newnode.next = temp.next;
            temp.next = newnode;
            temp = temp.next.next;
        }

        temp = head;
        while(temp != null) {
            Node node = temp.next;
            if(temp.random != null)
                node.random = temp.random.next;
            else node.random = null;

            temp = temp.next.next;
        }

        temp = head;
        Node copydummy = new Node(0);
        Node curr = copydummy;

        while(temp != null) {
            curr.next = temp.next;
            curr = curr.next;
            temp.next = temp.next.next;
            temp = temp.next;
        }

        return copydummy.next;
    }
}