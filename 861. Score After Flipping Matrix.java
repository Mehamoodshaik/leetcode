class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int rowValue = (1<<(n-1))*m;

        

        for (int j = 1; j < n; j++) {
            int sameBitCount = 0;
            for (int i = 0; i < m; i++) {
                if (grid[i][0] == grid[i][j]) {
                    sameBitCount++;
                }
            }
            sameBitCount = Math.max(sameBitCount, m-sameBitCount);
            int columnValue = (1<<(n-j-1))*sameBitCount;
            rowValue+= columnValue;
        }

    
        
        return rowValue;
    }
}
