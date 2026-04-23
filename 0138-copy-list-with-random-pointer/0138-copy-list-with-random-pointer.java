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
        if (head == null) return null;

        Node cur = head;

        while (cur != null) {
            Node temp = cur.next;

            Node copy = new Node(cur.val);
            cur.next = copy;
            copy.next = temp;

            cur = temp;
        }

        cur = head;
        while (cur != null) {
            if (cur.random != null) {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }

        Node orig = head;
        Node copy = head.next;
        Node copyHead = copy;

        while (orig != null) {
            orig.next = orig.next.next;

            if (copy.next != null) {
                copy.next = copy.next.next;
            }

            orig = orig.next;
            copy = copy.next;
        }

        return copyHead;
    }
}