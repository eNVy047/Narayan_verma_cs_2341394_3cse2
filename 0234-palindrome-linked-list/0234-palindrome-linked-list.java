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
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode sl = head;
        ListNode fa = head;

        while (fa != null && fa.next != null) {
            sl = sl.next;
            fa = fa.next.next;
        }
        ListNode prev = null;

        while (sl != null) {
            ListNode next = sl.next;
            sl.next = prev;
            prev = sl;
            sl = next;
        }

        ListNode fi = head;
        ListNode sec = prev;

        while (sec != null) {

            if (fi.val != sec.val) {
                return false;
            }

            fi = fi.next;
            sec = sec.next;
        }

        return true;
    }
}