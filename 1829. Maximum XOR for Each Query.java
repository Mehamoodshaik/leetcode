class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int preXor =0;
        
        for (int i = 0; i < n; i++) {
            preXor = nums[i] ^ preXor;
        }

        int[] res = new int[n];
        int mask = (1<<maximumBit)-1;
        for (int i = 0; i <n; i++) {
            res[i] = preXor^mask;
            preXor = preXor ^ nums[n-1-i];
           
        }
        return res;
    }
}


/*
class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int[] preXor = new int[n];
        preXor[0] = nums[0];
        for (int i = 1; i < n; i++) {
            preXor[i] = nums[i] ^ preXor[i - 1];
        }
        // for(int xo:preXor){
        // System.out.println(xo);
        // }


        // System.out.println(k);

        int[] res = new int[n];
        int mask = (1<<maximumBit)-1;
        for (int i = 0; i <n; i++) {
            int curXor = preXor[n-1-i];
            res[i] = curXor^mask;
           
        }
        return res;
    }
}

*/
