class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] remainderFrequency = new int[k];
        for(int num:arr){
            remainderFrequency[(num%k+k)%k]++;
        }
        if(remainderFrequency[0]%2!=0){
            return false;
        }
        for(int i=1;i<k;i++){
            if(remainderFrequency[i]!=remainderFrequency[k-i]){
                return false;
            }
        }
        return true;
    }
}
