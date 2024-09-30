class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[] {-1,-1};
        res[0] = leftMost(nums,target);
        if(res[0]!=-1){
            res[1] = rightMost(nums,target);
        }
        return res;
    }

    private int leftMost(int[] nums,int target){
        int index = -1;
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left +(right-left)/2;
            if(nums[mid]==target){
                index = mid;
                right = mid-1;
            }
            else if(nums[mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return index;
    }

    private int rightMost(int[]nums, int target ){
        int index = -1;
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left +(right-left)/2;
            if(nums[mid]==target){
                index = mid;
                left = mid+1;
            }
            else if(nums[mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return index;
    }
}

