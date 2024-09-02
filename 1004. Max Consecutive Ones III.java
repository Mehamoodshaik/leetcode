class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxLength = 0;
        int zeroCount = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}


/*
Intuition
The problem asks for the length of the longest subarray with at most k zeros. The key insight is to use a sliding window approach, which allows us to efficiently track and adjust the number of zeros within a window as we iterate through the array. The goal is to maintain a window that contains at most k zeros and to maximize the length of this window as we move through the array.

Approach
Sliding Window Technique:

We use two pointers, left and right, to represent the current window of elements.
As we expand the window by moving the right pointer, we count the number of zeros encountered.
If the number of zeros exceeds k, we start shrinking the window from the left by moving the left pointer until we have at most k zeros in the window again.
Maintaining Maximum Length:

Throughout the process, we continuously update the maxLength variable to keep track of the maximum size of any valid window encountered.
Optimization:

The solution runs in linear time, and it uses constant space, making it optimal for large input sizes.
Complexity Analysis
Time Complexity: (O(n)), where (n) is the length of the array nums. Both pointers, left and right, traverse the array at most once.
Space Complexity: (O(1)), as the algorithm uses a constant amount of additional space regardless of the input size.
*/
