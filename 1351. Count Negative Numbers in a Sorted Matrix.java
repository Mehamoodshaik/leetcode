class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            int left = 0;
            int right = grid[0].length - 1;
            int index = -1;

            // Binary search for the first negative number in the row
            while (left <= right) {
                if (grid[i][right] >= 0) {
                    break; // No negatives in this row, skip
                }
                int mid = left + (right - left) / 2;
                if (grid[i][mid] < 0) {
                    index = mid;
                    right = mid - 1; // Search in the left half
                } else {
                    left = mid + 1; // Search in the right half
                }
            }

            // If we found a negative number, count the remaining numbers in the row
            if (index >= 0) {
                count += (grid[0].length - index);
            }
        }
        return count;
    }
}
