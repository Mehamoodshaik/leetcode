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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> breadthQueue = new LinkedList<>();
        PriorityQueue<Long> minHeap = new PriorityQueue<>();

        breadthQueue.add(root);
        while(!breadthQueue.isEmpty()){
            long sum = 0;
            int size = breadthQueue.size();
            for(int i=0;i<size;i++){
                TreeNode node = breadthQueue.remove();
                sum+=node.val;
                if(node.left!=null){
                    breadthQueue.add(node.left);
                }
                if(node.right!=null){
                    breadthQueue.add(node.right);
                }
            }
            minHeap.add(sum);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        if(minHeap.size()<k){
            return -1;
        }
        return minHeap.peek();
    }
}
