class Solution {
    public long continuousSubarrays(int[] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int left=0,right=0;
        long count = 0;

        int n = nums.length;
        while(right<n){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);


            while(map.lastEntry().getKey()-map.firstEntry().getKey()>2){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            count+=right-left+1;
            right++;
        }
        return count;
    }
}
