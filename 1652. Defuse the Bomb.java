class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length, windowSum = 0;
        int[] res = new int[n];
        if(k==0){
            return res;
        }

        int left =1,right = k;
        if(k<0){
            left = n- Math.abs(k);
            right = n-1;
        }

        for(int i=left;i<=right;i++){
            windowSum += code[i];
        }

        for(int i=0;i<n;i++){
            res[i] = windowSum;
            windowSum -= code[left%n];
            windowSum += code[(right+1)%n];
            left++;
            right++;
        }

        return res;
    }
}
