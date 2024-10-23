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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> levelQueue = new LinkedList<>();
        levelQueue.offer(root);
        int levelIndex = 1;
        while(!levelQueue.isEmpty()){
            int levelSize = levelQueue.size();
            for(int i=0;i<levelSize;i++){
                TreeNode node = levelQueue.poll();
                if(node.left==null && node.right==null){
                    return levelIndex;
                }
                if(node.left!=null){
                    levelQueue.offer(node.left);
                }
                if(node.right!=null){
                    levelQueue.offer(node.right);
                }
            }
            levelIndex++;
        }
        return levelIndex;
    }
}
