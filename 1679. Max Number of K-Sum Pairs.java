class Solution {
    public int maxOperations(int[] nums, int k) {
       Arrays.sort(nums);
       int count = 0;
       int left = 0;
       int right = nums.length - 1;
       while(left < right){
        if(nums[left] + nums[right] == k){
            count++;
            left++;
            right--;
        }else if(nums[left] + nums[right] < k){
            left++;
        }else{
            right--;
        }
       }

       return count; 
    }
}

/*
Two-Pointer Approach
Intuition:
The idea behind this approach is to sort the array, which allows us to use two pointers to efficiently find pairs of numbers that sum up to ( k ). By starting one pointer at the beginning (start) and the other at the end (end) of the sorted array, we can adjust the pointers based on whether the sum of the two pointed values is greater than, less than, or equal to ( k ).

Approach:

Sort the Array: First, sort the array to bring pairs that sum to ( k ) closer together.
Initialize Pointers: Set start to the beginning of the array (index 0) and end to the end of the array (last index).
Iterate with Two Pointers:
If the sum of nums[start] and nums[end] equals ( k ), a valid pair is found. Increment count and move both pointers inward (i.e., start++ and end--).
If the sum is less than ( k ), increment start to increase the sum.
If the sum is greater than ( k ), decrement end to decrease the sum.
Repeat: Continue this process until start and end pointers meet.
Return Count: The count of valid pairs is returned.
Complexity:

Time Complexity: ( O(n \log n) ) due to the sorting step. The two-pointer traversal is ( O(n) ), but the overall complexity is dominated by the sorting step.
Space Complexity: ( O(1) ) as no extra space is required beyond a few variables for pointers and counters.
*/
