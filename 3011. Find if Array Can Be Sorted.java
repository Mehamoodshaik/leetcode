class Solution {
    public boolean canSortArray(int[] nums) {
        int n = nums.length;
        int[] dummy = nums.clone();
        for(int i=0;i<n-1;i++){
                if(dummy[i]<=dummy[i+1]){
                    continue;
                }else{
                    if(Integer.bitCount(dummy[i]) == Integer.bitCount(dummy[i+1])){
                        int temp = dummy[i];
                        dummy[i] = dummy[i+1];
                        dummy[i+1] = temp;
                    }else{
                        return false;
                    }
                }
        
        }

        for(int i=n-1;i>=1;i--){
            if(dummy[i]>=dummy[i-1]){
                continue;
            }else{
                if(Integer.bitCount(dummy[i]) == Integer.bitCount(dummy[i-1])){
                        int temp = dummy[i];
                        dummy[i] = dummy[i-1];
                        dummy[i-1] = temp;
                    }else{
                        return false;
                    }
            }
        }
        return true;
    }
}
