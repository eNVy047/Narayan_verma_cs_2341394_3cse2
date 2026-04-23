// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         ListNode a = headA;
//         ListNode b = headB;
//         while (a != b) {
//             if (a == null) {
//                 a = headB;
//             } else {
//                 a = a.next;
//             }
//             if (b == null) {
//                 b = headA;
//             } else {
//                 b = b.next;
//             }
//         }
//         return a;
//     }
// }

public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode fir = headA;
        while (fir.next != null) {
            fir = fir.next;
        }

        fir.next = headB;
        ListNode slow = headA;
        ListNode fast = headA;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = headA;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                fir.next = null;
                return slow;
            }
        }
        fir.next = null;
        return null;
    }
}