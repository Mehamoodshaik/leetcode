class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int res = 0;
        //Boolean Array to store ASCII values 
        boolean[] seen = new boolean[128];
        for(int right = 0;right<s.length();right++){
            //Iterate over a while loop till character at right pointer is seen
            while(left<right && seen[s.charAt(right)]){
                seen[s.charAt(left)] = false;
                left++;
            }
            //make character at right pointer visited 
            seen[s.charAt(right)]= true;
            //Update maximum length
            res = Math.max(res, right-left+1);
        }
        return res;
    }
}
