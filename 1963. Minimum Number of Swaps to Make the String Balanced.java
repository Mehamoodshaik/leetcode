class Solution {
    public int minSwaps(String s) {
        int imbalance = 0; 
        int maxImbalance = 0;
        for(char c:s.toCharArray()){
            if(c=='['){
                imbalance--;
            }
            else{
                imbalance++;
            }
            maxImbalance = Math.max(imbalance, maxImbalance);
        }
        return (maxImbalance+1)/2;
    }
}
