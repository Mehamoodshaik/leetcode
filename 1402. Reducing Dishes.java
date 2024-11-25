class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int tot = 0, cur=0;
        int n = satisfaction.length;
        for(int i=n-1;i>=0 && satisfaction[i]+cur>0;i--){
            cur+= satisfaction[i];
            tot+= cur;
        }

        return tot;
    }
}
