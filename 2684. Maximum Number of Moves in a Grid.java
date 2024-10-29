class Solution {
    private final int[] directions = { -1, 0, 1 };

    public int maxMoves(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            queue.offer(new int[] { i, 0, 0 });
        }

        int maxMoves = 0;
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                int[] arr = queue.poll();
                int r = arr[0];
                int c = arr[1];
                int count = arr[2];

                maxMoves = Math.max(maxMoves, count);
                for (int direction : directions) {
                    int newR = r + direction;
                    int newC = c + 1;
                    if (newR >= 0 && newR < rows && newC >= 0 && newC < cols && grid[r][c]<grid[newR][newC] &&!visited[newR][newC]) {
                        queue.offer(new int[] { newR, newC, count + 1 });
                        visited[newR][newC] = true;
                    }
                }
            }

        }
        return maxMoves;
    }
}
