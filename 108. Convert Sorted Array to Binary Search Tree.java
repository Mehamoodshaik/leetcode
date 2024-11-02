/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        if(n==0){
            return new TreeNode();
        }
        return helper(nums,0,n-1);
    }

    public TreeNode helper(int[] nums, int low, int high){
        if(low>high){
            return null;
        }
        int mid = low +(high-low)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums,low,mid-1);
        node.right = helper(nums,mid+1,high);
        return node;
    }
}
