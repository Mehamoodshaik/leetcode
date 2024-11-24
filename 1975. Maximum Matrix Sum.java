class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        long totalSum = 0;
        boolean negCount = false;
        int minAbsVal = Integer.MAX_VALUE;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int ele = matrix[i][j];
                if(ele<0){
                    negCount = !negCount;
                    ele = -ele;
                }
                totalSum+=ele;
                if(ele<minAbsVal){
                    minAbsVal = ele;
                }
            }
        }
        if(negCount){
            return totalSum-(2*minAbsVal);
        }
        return totalSum;

    }
}


/*
Algorithm
Initialize totalSum to 0, minAbsVal to INT_MAX, and negativeCount to 0 to store the sum of absolute values, track the smallest absolute value, and count the number of negative elements, respectively.

For each row in matrix:

For each val in the row:
Add the absolute value of val to totalSum to accumulate the absolute sum.
If val is negative, increment negativeCount.
Update minAbsVal to the smaller of minAbsVal and abs(val).
After traversing the matrix, check if negativeCount is odd:

If it is, subtract 2 * minAbsVal from totalSum to adjust for the odd number of negatives, ensuring the maximum possible matrix sum.
Return totalSum, which now represents the maximum achievable matrix sum after adjustments.
*/
