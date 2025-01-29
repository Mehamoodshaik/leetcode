class Solution {
    private static int[] mr = {0,0,-1,1};
    private static int[] mc = {1,-1,0,0};
    public int findMaxFish(int[][] grid) {
        int rows = grid.length;
        int cols= grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int maxFish = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                visited[i][j] = true;
                int[] currentFish = new int[1]; 
                if(grid[i][j]>0){    
                    bfs(grid,currentFish, i, j, rows, cols, visited);
                    maxFish = Math.max(currentFish[0], maxFish);
                }
                
            }
        }
        return maxFish;
    }

    public void bfs(int[][] grid, int[] currentFish, int row, int col, int rows, int cols, boolean[][]visited){
        
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{row,col});
        visited[row][col] = true;
        while(!q.isEmpty()){
            int[] currentCell = q.remove();
            
            int currentRow = currentCell[0];
            int currentCol = currentCell[1];

            currentFish[0] += grid[currentRow][currentCol];

            for(int i=0;i<4;i++){
                int nextRow = currentRow+mr[i];
                int nextCol = currentCol+mc[i];
                if(0<=nextRow && nextRow<rows && 0<=nextCol && nextCol<cols && !visited[nextRow][nextCol]){
                    visited[nextRow][nextCol] = true;
                    if(grid[nextRow][nextCol]>0){
                        q.add(new int[]{nextRow, nextCol});
                    }
                }
            }
        }
        
    }
}
