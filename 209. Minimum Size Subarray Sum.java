class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n= nums.length;
        int minLen = n+1, left=0,sum=0;
        for(int right=0;right<n;right++){
            sum+=nums[right];
            while(sum>=target){
                minLen = Math.min(minLen,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return minLen>n?0:minLen;
    }
}
