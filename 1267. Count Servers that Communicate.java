class Solution {
    public int countServers(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[] rowLevel = new int[cols];
        int[] colLevel = new int[rows];
        int res = 0;
        //int totalServers =0;
        for(int i=0;i< rows; i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    rowLevel[j]++;
                    colLevel[i]++;
                }
            }    
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    if(rowLevel[j]>1 || colLevel[i]>1){
                        res++;
                    }
                }
            }
        }
        

        return res;


    }
}
