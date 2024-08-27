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
    public ListNode removeElements(ListNode head, int val) { 
        while(head!=null && head.val==val ){
            head = head.next;
        }
        ListNode current = head;
        while(current!=null && current.next!=null){
            if (current.next.val==val){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
        return head;
    }
}

/*
Intuition
The problem is to remove all nodes from a linked list that contain a specific value. The challenge arises because the node to be removed can be anywhere in the list, including the head. Therefore, we need an efficient way to traverse the list, identify nodes with the target value, and remove them by adjusting the pointers.

Approach
Remove Leading Nodes:
First, handle the special case where the head of the linked list itself contains the target value val.
We keep updating the head to the next node until the head's value is not equal to val or until the entire list is traversed (i.e., the head becomes null).
Traverse the List:
Initialize a pointer current to the new head of the list
Traverse the list using current, checking the next node's value.
If current.next.val equals val, skip the next node by setting current.next to current.next.next. This effectively removes the node from the list.
If the next node's value does not equal val, move current to the next node.
Return the Updated Head:
After the traversal, the modified list (with the required elements removed) is returned starting from the head.
Complexity
Time Complexity:
The algorithm runs in O(n) time, where n is the number of nodes in the linked list. This is because each node in the list is visited at most once during the traversal.
Space Complexity:
The space complexity is O(1) since the algorithm uses only a constant amount of extra space (for the current pointer and a few other variables). No additional data structures are used that would require more space.
*/
