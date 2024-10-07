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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null){
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode previous = null;
        ListNode next ;
        ListNode current = slow.next;
        
        while(current!=null){
            next = current.next;
            current.next = previous;
            previous  = current;
            current = next;
        }

        slow.next = null;

        ListNode left = head;
        ListNode right = previous;
        while(left!=null && right!=null){
            ListNode leftNext = left.next;
            ListNode rightNext = right.next;

            left.next = right;
            right.next = leftNext;
            left = leftNext;
            right = rightNext;
        }


    }
}
