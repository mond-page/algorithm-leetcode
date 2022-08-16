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
    public ListNode middleNode(ListNode head) {
        ListNode firstPoint = head;
        ListNode secondPoint = head;
        
        while(secondPoint != null) {
            if (secondPoint.next == null) {
                break;
            } else if (secondPoint.next.next == null) {
                firstPoint = firstPoint.next;
                break;
            }
            firstPoint = firstPoint.next;
            secondPoint = secondPoint.next.next;
        }
        
        return firstPoint;
    }
}