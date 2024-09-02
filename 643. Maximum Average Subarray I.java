class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int k_window_sum = 0;
        for (int i = 0; i < k; i++) {
            k_window_sum += nums[i];
        }     
        int max_sum = k_window_sum;
        for (int i = k; i < n; i++) {
            k_window_sum += nums[i] - nums[i - k];
            max_sum = Math.max(max_sum, k_window_sum);
        }
        return (double) max_sum / k;
    }
}

/*
Intuition:
To find the maximum average of any subarray of length k in an array, we need to maximize the sum of the subarray first, as the average is directly proportional to the sum when k is fixed. A brute-force approach would involve calculating the sum of every possible subarray of length k, but this would be inefficient. Instead, we can use a sliding window technique to keep track of the sum of the current window of length k as we slide across the array. By updating the sum efficiently, we can determine the maximum sum (and hence the maximum average) in linear time.

Approach:
Initial Window Sum: First, calculate the sum of the first k elements of the array. This sum represents the sum of the first window.
Sliding Window: Starting from the (k+1)th element, slide the window across the array one element at a time:
For each new element that enters the window, add its value to the current window sum.
Subtract the value of the element that is leaving the window (i.e., the element that is k positions behind the current element).
After each update, check if the current window sum is greater than the previously recorded maximum sum. If it is, update the maximum sum.
Calculate the Maximum Average: Once we have the maximum sum for any window of length k, divide it by k to get the maximum average.
Complexity Analysis:
Time Complexity: (O(n)), where n is the length of the array. We traverse the array only once, updating the window sum and checking for the maximum sum in constant time for each element.
Space Complexity: (O(1)), since we only use a few extra variables (k_window_sum, max_sum) and do not require any additional data structures.
*/
