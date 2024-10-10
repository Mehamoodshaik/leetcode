class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int maxWidth = 0;

        Stack<Integer> stack = new Stack<>();
        // Step 1: Build the stack with indices of a non-increasing sequence
        for(int i = 0; i < n; i++) {
            if(stack.isEmpty() || nums[i] < nums[stack.peek()]) {
                stack.push(i);
            }
        }

        // Step 2: Traverse from right to left to find maximum width ramp
        for(int j = n - 1; j >= 0; j--) {
            // Use a while loop to pop all valid indices for the current j
            while(!stack.isEmpty() && nums[j] >= nums[stack.peek()]) {
                int i = stack.pop();
                maxWidth = Math.max(maxWidth, j - i);
            }
        }
        return maxWidth;

        
    }
}
