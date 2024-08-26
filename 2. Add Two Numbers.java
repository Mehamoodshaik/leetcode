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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;
        while(l1!=null || l2!=null){
            int a = (l1!=null) ? l1.val : 0;
            int b = (l2!=null) ? l2.val : 0;
            int sum = carry + a + b;
            carry = sum/10;
            sum = sum%10;
           
            current.next = new ListNode(sum);
            current = current.next;
            if(l1!=null){
                l1 = l1.next;
            }
            if(l2!=null){
                l2 = l2.next;
            }
        }

        if(carry>0){
            current.next = new ListNode(carry);
        }

        return dummyHead.next;

    }
}

//https://leetcode.com/problems/add-two-numbers/solutions/5695877/1ms-beats-100-solutions-java

/*
Intuition
The problem asks us to add two numbers that are represented by linked lists, where each node contains a single digit. The digits are stored in reverse order, meaning that the 1's digit is at the head of the list. Our task is to add these two numbers and return the sum as a linked list, also in reverse order.

The key idea is to simulate the addition process that we do by hand, digit by digit, while keeping track of the carry from the sum of each pair of digits. We traverse both linked lists simultaneously, add corresponding digits along with the carry, and store the result in a new linked list.

Approach
Initialize Pointers and Variables:
Use a dummy head node (dummyHead) to simplify the construction of the result list.
Initialize a pointer (current) to track the current node in the result list.
Initialize a variable carry to store any carry-over during addition.
Traverse Both Linked Lists:
Use a loop to traverse both l1 and l2. Continue the loop until both lists are fully traversed.
At each iteration:
Extract the values from the current nodes of l1 and l2. If a list has been fully traversed, use 0 as the value.
Calculate the sum of these values plus the carry.
Update the carry for the next iteration as carry = sum / 10.
Create a new node with the digit part of the sum (sum % 10) and attach it to the current node.
Move the current pointer to the next node.
Handle Remaining Carry:
After the loop, if there's any remaining carry (i.e., carry > 0), create a new node with this value and attach it to the result list.
Return the Result:
The result linked list starts after the dummyHead, so return dummyHead.next.
Complexity
Time complexity:O(max(m,n))
The algorithm traverses both linked lists once, where m and n are the lengths of l1 and l2 respectively. Since we might need to traverse the longer list completely, the time complexity is proportional to the length of the longer list, i.e., O(max(m,n)).
Space complexity: O(max(m,n))
The space complexity is determined by the size of the output linked list, which in the worst case will have one more node than the longer input list (due to a possible carry). Thus, the space complexity is O(max(m,n)).
*/
