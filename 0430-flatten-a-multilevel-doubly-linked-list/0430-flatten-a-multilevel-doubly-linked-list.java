/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null) return null;
        FlattenDFS(head);
        return head;
    };
    private Node FlattenDFS(Node head){
        Node curr = head;
        Node tail = head;
        while(curr != null){
            Node next = curr.next;
            if(curr.child != null){
                Node chiHed = curr.child;
                Node chiTel = FlattenDFS(chiHed);
                curr.next = chiHed;
                chiHed.prev = curr;
                if(next != null){
                    chiTel.next = next;
                    next.prev = chiTel;
                };
                curr.child = null;
                tail = chiTel;
                curr = chiTel;
            }else{
                tail = curr;
            }
            curr = curr.next;
        }
        return tail;
    }
}