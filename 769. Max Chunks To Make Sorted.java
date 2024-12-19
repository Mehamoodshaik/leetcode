class Solution {
    public int maxChunksToSorted(int[] arr) {

        //Initialize size of array, prefix Sorted Sum and current Sum and chunks(res)
        int n = arr.length;
        int prefSum = 0;
        int res = 0;
        int curSum = 0;

        //[0,1,3,6,10]  Sorted prefix sum for n=5 
        
        for(int i=0;i<n;i++){
            curSum+=arr[i];   //Update currentSum so far
            prefSum+=i;       //Updated Sorted prefix Sum 

            if(curSum<=prefSum){    //If current Sum is less than or equal to sorted prefixSum then there's a valid chunk increase the count
                res++;
            }
        }
        return res;
    }
}
