class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int c = 0;
        for(int i=0;i<nums.size();i++){
            for(int j=nums.size()-1;j>i;j--){
                if(nums.get(i)+nums.get(j)<target){
                    c++;
                }
            }
        }
        return c;

    }
}
