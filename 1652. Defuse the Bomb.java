class Solution {
    public int[] decrypt(int[] code, int k) {

        //Initialize Variables 
        int n = code.length, windowSum = 0;
        int[] res = new int[n];

        //If value of k is zero return res
        if(k==0){
            return res;
        }

        //Initialize the window pointers 
        int left =1,right = k;

        //If the vlaue of k is negative, then change the pointers
        if(k<0){
            left = n- Math.abs(k);
            right = n-1;
        }

        //Calculate the window Sum
        for(int i=left;i<=right;i++){
            windowSum += code[i];
        }

        // Now slide the window by iterating the values in code
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
