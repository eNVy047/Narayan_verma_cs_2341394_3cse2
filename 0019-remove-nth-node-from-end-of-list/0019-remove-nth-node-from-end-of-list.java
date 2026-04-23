class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode count = head;
        while(count != null){
            count = count.next;
            size++;
        }
        if (n == size) {
            return head.next;
        }
        count = head;
        for (int i = 1; i < size - n; i++) {
            count = count.next;
        }
        count.next = count.next.next;
        return head;
    }
}