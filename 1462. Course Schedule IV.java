class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adjList.add(new ArrayList<>());
        }
        
        for(int[] prerequisite: prerequisites){
            adjList.get(prerequisite[0]).add(prerequisite[1]);
        }

        List<Boolean> res = new ArrayList<>();

        for(int[] query:queries){
            boolean[] visited = new boolean[numCourses];
            res.add(isprerequisite(adjList,visited, query[0], query[1]));
        }
        return res;
    }

    public boolean isprerequisite(List<List<Integer>> adjList, boolean[] visited, int initialCourse, int finalCourse){
        visited[initialCourse] = true;
        if(initialCourse==finalCourse)return true;
        boolean answer = false;
        for(int neighbor:adjList.get(initialCourse)){
            if(!visited[neighbor]){
                answer = answer || isprerequisite(adjList, visited,neighbor, finalCourse);
            }
        }
        return answer;
    }
}
