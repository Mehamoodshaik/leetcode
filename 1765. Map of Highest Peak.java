class Solution {
    private static int[] xDirections = {0,0,1,-1};
    private static int[] yDirections = {1,-1,0,0};
    public int[][] highestPeak(int[][] isWater) {
        

        int rows = isWater.length;
        int cols = isWater[0].length;

        int[][] cellHeights = new int[rows][cols];
        for(int[] currentRow: cellHeights){
            Arrays.fill(currentRow,-1);
        }

        Queue<int[]> cellQueue = new LinkedList<>();

        for(int i= 0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(isWater[i][j]==1){
                    cellQueue.add(new int[]{i,j});
                    cellHeights[i][j] = 0;
                }
            }
        }

        int heightOfNextLayer = 1;

        while(!cellQueue.isEmpty()){
            int size = cellQueue.size();

            for(int i=0;i<size;i++){
                int[] currentCell = cellQueue.poll();
                for(int j=0;j<4;j++){
                    int nextX = currentCell[0] + xDirections[j];
                    int nextY = currentCell[1] + yDirections[j];

                    if(nextX>=0 && nextX<rows && nextY>=0 && nextY<cols && cellHeights[nextX][nextY]==-1){
                        cellHeights[nextX][nextY] = heightOfNextLayer;
                        cellQueue.add(new int[]{nextX, nextY});
                    }
                }
            }
            heightOfNextLayer++;
        }
        return cellHeights;
    }
}
