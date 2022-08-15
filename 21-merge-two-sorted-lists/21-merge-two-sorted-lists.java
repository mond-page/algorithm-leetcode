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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merge = new ListNode();
    
        while(list1 != null) {
            insertListNode(merge, list1.val);
            list1 = list1.next;
        }
        
        while(list2 != null) {
            insertListNode(merge, list2.val);
            list2 = list2.next;
        }
        
        return merge.next;
    }
    
    private void insertListNode(ListNode merge, int inputValue) {
        ListNode insert = new ListNode(inputValue);
        while(merge.next != null) {
            if (merge.next.val >= inputValue) {
                insert.next = merge.next;
                merge.next = insert;
                return;
            }
            merge = merge.next;
        }
        merge.next = insert;
    }
}