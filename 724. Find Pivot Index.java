class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int totalSum = 0;
        int n = nums.length;
        for(int num: nums){
            totalSum+=num;
        }
        for(int i=0;i<n;i++){
            int rightSum = totalSum-leftSum-nums[i];
            if(leftSum==rightSum){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
}

/*
Intuition
To find the pivot index in an array, the goal is to find an index where the sum of the elements to the left of that index equals the sum of the elements to the right of that index. The challenge is to compute this efficiently without recalculating sums multiple times.

Approach
Calculate Total Sum:

First, compute the total sum of all elements in the array. This helps in calculating the right sum dynamically.
Iterate to Find Pivot:

Traverse the array while maintaining a running sum of elements to the left of the current index (leftSum).
For each index, compute the right sum using the formula: rightSum = totalSum - leftSum - nums[i].
Compare leftSum with rightSum. If they are equal, the current index is the pivot index.
Update leftSum for the next iteration by adding the current element (nums[i]).
Return Result:

If a pivot index is found, return it. If no such index exists, return -1.
Complexity
Time Complexity: (O(n)), where (n) is the length of the array. We traverse the array twice: once to compute the total sum and once to find the pivot index.
Space Complexity: (O(1)), as only a few extra variables are used, and no additional data structures are required.
*/
