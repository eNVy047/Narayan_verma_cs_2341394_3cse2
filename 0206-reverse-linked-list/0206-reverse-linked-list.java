class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curnt = head;
        
        while (curnt != null) {
            ListNode nextTemp = curnt.next; 
            
            curnt.next = prev; 
            prev = curnt;
            curnt = nextTemp;
        }
        return prev;
    }
}