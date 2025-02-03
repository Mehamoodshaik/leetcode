class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int longestStreak = 1;
        int increaseStreak = 1;
        int decreaseStreak = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                increaseStreak++;
                decreaseStreak = 1;
            }else if(nums[i]<nums[i-1]){
                decreaseStreak++;
                increaseStreak = 1;
            }else{
                decreaseStreak = 1;
                increaseStreak = 1;
            }

            longestStreak = Math.max(Math.max(decreaseStreak,increaseStreak),longestStreak);
        }
        
        
        return longestStreak;
    }
}
