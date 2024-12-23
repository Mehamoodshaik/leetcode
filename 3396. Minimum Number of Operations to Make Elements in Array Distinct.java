class Solution {
    public int minimumOperations(int[] nums) {
        int operations = 0;
        int[] freq = new int[101];
        for(int i=nums.length-1;i>=0;i--){
            if(++freq[nums[i]]>1) return (int)Math.ceil((double)(i+1)/3);
        }
        return 0;
    }
}
