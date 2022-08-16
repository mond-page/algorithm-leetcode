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
    public ListNode reverseList(ListNode head) {
        ListNode reverse = new ListNode();
        
        while(head != null) {
            if (reverse.next == null) {
                reverse.next  = new ListNode(head.val);
                head = head.next;
                continue;
            }
            ListNode temp = new ListNode(head.val);
            temp.next = reverse.next;
            reverse.next = temp;
            head = head.next;
        }
        
        return reverse.next;
    }
}