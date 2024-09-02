class Solution {
    public int longestSubarray(int[] nums) {
        int zeroCount = 0;
        int maxLength = 0;
        int n = nums.length;
        int left = 0;
        for(int right = 0;right<n;right++){
            if(nums[right]==0){
                zeroCount++;
            }
            while(zeroCount>1){
                if(nums[left]==0){
                    zeroCount--;
                }
                left++;
            }
            maxLength = Math.max(maxLength,right-left);
            
        }
        return maxLength;
    }
}
/*
Intuition
The goal is to find the longest contiguous subarray with at most one zero. The sliding window technique helps to dynamically adjust the size of the window while ensuring the constraint (at most one zero) is met.

Approach
Initialize Variables:

Use two pointers (left and right) to represent the current window in the array.
Track the number of zeros (zeroCount) in the current window.
Keep a variable (maxLength) to store the length of the longest valid subarray found.
Expand the Window:

Traverse the array using the right pointer. Include the element at right in the window and update zeroCount if it's a zero.
Contract the Window:

If zeroCount exceeds 1, move the left pointer to the right until zeroCount is 1 or less.
Update Maximum Length:

Continuously update maxLength with the length of the current valid window (right - left).
Complexity
Time Complexity: (O(n)), where (n) is the length of the array. Both pointers (left and right) traverse the array once.
Space Complexity: (O(1)), as only a constant amount of extra space is used for variables.
*/
