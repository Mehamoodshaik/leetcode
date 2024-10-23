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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> levelOrder = new LinkedList<>();
        if(root==null){
            return levelOrder;
        }
        Queue<TreeNode> levelsQueue = new LinkedList<>();
        levelsQueue.offer(root);
        while(!levelsQueue.isEmpty()){
            int levelSize = levelsQueue.size();
            List<Integer> levelNodes = new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                TreeNode node = levelsQueue.poll();
                levelNodes.add(node.val);
                if(node.left!=null){
                    levelsQueue.offer(node.left);
                }
                if(node.right!=null){
                    levelsQueue.offer(node.right);
                }
            }
            levelOrder.addFirst(levelNodes);
        }
        //Collections.reverse(levelOrder);
        return levelOrder;
    }
}
