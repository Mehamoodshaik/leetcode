class Solution {
    public int maxChunksToSorted(int[] arr) {

        //Initialize Array Length
        int n = arr.length;

        //PreComputer Minimum Suffix
        int[] suffMin = new int[n];
        suffMin[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            suffMin[i] = Math.min(suffMin[i+1],arr[i]);
        }

        // For Example  arr= [2,1,3,4,4]
        // SuffMin would be [1,1,3,4,4]

        int res=1;
        int maxSoFar = arr[0];      //Initialize a variable Max So Far

        //Iterate through Array and check if Max So Far is less than  or equal to it's suffix Minimum, if So increment chunks 
        for(int i=0;i<n-1;i++){
            if(maxSoFar<=suffMin[i+1]){
                res++;
            }

            //Update maxSoFar for every iteration
            maxSoFar = Math.max(maxSoFar,arr[i+1]);
        }

        return res;
    }
}
