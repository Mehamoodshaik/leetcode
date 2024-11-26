class Solution {
    public int findChampion(int n, int[][] edges) {

        // Initialize a boolean Array Indegree to store Indegree
        boolean[] indegree = new boolean[n];

        // If there is an indegree make it true (Winner won't have any indegree)
        for (int[] edge : edges) {
            indegree[edge[1]] = true;
        }

        // Initialize championCounts & championINdex
        int champCount = 0;
        int champIndex = 0;

        for (int i = 0; i < n; i++) {

            // If Indgree is still False then that index don't have any Indegree, Can be
            // consider as Champion
            if (!indegree[i]) {
                // Increment Champion COunter and store the champion Index
                champCount++;
                champIndex = i;
            }
        }

        // If the champion COunt >1 then we can say there are no champpions and return
        // -1
        if (champCount > 1) {
            return -1;
        }

        // Else return Champion Index
        return champIndex;
    }
}
