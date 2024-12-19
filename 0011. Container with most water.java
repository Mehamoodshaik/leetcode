class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int max = Integer.MIN_VALUE;
        while(start<end){
            max = Math.max(max,(Math.min(height[start],height[end])*(end-start)));
            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }
            
        }
        return max;
    }
}

/*
Intuition
The problem is to find the maximum area of water that can be trapped between two lines on a plane. The area of water trapped between two lines is determined by the shorter of the two lines and the distance between them. To maximize the area, we need to find the optimal pair of lines.

Approach
Two-Pointer Technique:

Use two pointers, start and end, initially set to the beginning and end of the array respectively.
Calculate the area between the lines at these pointers and keep track of the maximum area found.
Move the pointer pointing to the shorter line inward, as this might help in finding a taller line that could potentially increase the area.
Loop Until Pointers Meet:

Continue the process until the start pointer is less than the end pointer. This ensures that all possible pairs of lines are considered.
Complexity Analysis
Time Complexity: ( O(n) )

The algorithm processes each element at most once, making the time complexity linear.
Space Complexity: ( O(1) )

The solution uses a constant amount of extra space for variables, so the space complexity is constant.
*/
