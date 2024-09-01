class Solution {
    public void moveZeroes(int[] nums) {
        int index  =0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[index] = nums[i];
                index++;
            }
            
        }
        while(index<n){
                nums[index]=0;
                index++;
            }
    }
}

/*
Intuition
The idea is to first move all non-zero elements to the beginning of the array, then fill the remaining positions with zeroes. The first pass through the array will place all non-zero elements in the correct order at the start, and the second pass will handle placing zeroes in the remaining slots.

Approach
Initialization:
Index is initialized to 0. It keeps track of the position where the next non-zero element should be placed in the array.
n is set to the length of the array nums.
First Pass:
Iterate through the array with the loop for(int i=0; i<n; i++).
If nums[i] is non-zero, assign nums[i] to nums[index], and then increment index.
This will move all non-zero elements to the beginning of the array while maintaining their order.
Second Pass:
After the first loop, index points to the position where the next zero should be placed.
Use a while loop to fill the rest of the array with zeroes, starting from index to n-1.
Complexity
Time complexity: O(n)
The array is traversed twice, once for moving non-zero elements and once for placing zeroes. Each traversal is linear in terms of the size of the array.
Space Complexity: O(1)
The algorithm uses only a constant amount of extra space for the index variable. No additional space is needed that scales with the size of the input.
*/
