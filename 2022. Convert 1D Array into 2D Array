class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length!=(m*n)) {
            return new int[0][0];
        }
        int[][] res = new int[m][n];
        int count = 0;
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j] = original[count];
                count++;
            }
        }
        return res;
    }
}

/*
Intuition
The problem asks for converting a one-dimensional array into a two-dimensional array with specified dimensions ( m * n ). The primary concern is ensuring that the number of elements in the original array exactly matches the product of the dimensions ( m * n ). If this condition is not met, the conversion is impossible, and we should return an empty 2D array. Otherwise, we can directly map elements from the 1D array to the 2D array.

Approach
Check the Size Condition:

First, verify if the length of the original array matches ( m*n ). If it doesn't, return an empty 2D array since it’s impossible to reshape the array into the desired dimensions.
Initialize the Result Array:

Create a 2D array res with m rows and n columns.
Populate the 2D Array:

Use nested loops to iterate through each element of the 2D array.
For each position (i, j) in the 2D array, assign the value from the original array at index count and increment count.
Return the Result:

Once the entire 2D array is populated, return it as the final result.
Complexity Analysis
Time Complexity: ( O(m*n) ).

The algorithm iterates through each element of the 2D array exactly once, performing a constant-time operation for each assignment.
Space Complexity: ( O(m * n) ).

The space required is proportional to the size of the 2D array that we need to construct, which is ( m * n ). The space used for the original array is not considered extra space since it is given as input.
*/
