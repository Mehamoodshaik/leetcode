class Solution {

    private int[][] directions = {{-1,0},{0,-1},{0,1},{1,0}};
    public int minimumObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Deque<int[]> q = new ArrayDeque<>();
        int[][] minObstacles = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                minObstacles[i][j] = Integer.MAX_VALUE;
            }
        }

        minObstacles[0][0] = 0;
        q.add(new int[]{0,0,0});

        while(!q.isEmpty()){
            int[] current = q.poll();
            int obs = current[0], r = current[1], c = current[2];

            for(int[] d:directions){
                int newR = r+d[0];
                int newC = c+d[1];

                if(0<=newR && newR<m && 0<=newC && newC<n && minObstacles[newR][newC]==Integer.MAX_VALUE){
                    if(grid[newR][newC]==1){
                        minObstacles[newR][newC] = obs+1;
                        q.addLast(new int[]{obs+1,newR,newC});
                    }else{
                        minObstacles[newR][newC] = obs;
                        q.addFirst(new int[]{obs,newR,newC});
                    }
                }
            }
        }

        return minObstacles[m-1][n-1];
    }
}
