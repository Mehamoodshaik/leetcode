class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        
        // Binary search for the first position where the missing count >= k
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int missingCount = arr[mid] - (mid + 1); // Numbers missing before arr[mid]
            
            if (missingCount < k) {
                // If fewer than k numbers are missing, move right
                low = mid + 1;
            } else {
                // If k or more numbers are missing, move left
                high = mid - 1;
            }
        }
        
        // At the end of the loop, low points to the smallest index where missingCount >= k
        // If no index satisfies the condition, it means the k-th missing number is after arr[high]
        return low + k;
    }
}
