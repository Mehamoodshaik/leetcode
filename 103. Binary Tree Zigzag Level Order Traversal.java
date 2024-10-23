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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        if(root==null){
            return levels;
        }
        Queue<TreeNode> levelsQueue = new LinkedList<>();
        levelsQueue.offer(root);
        int levelIndex = 0;
        while(!levelsQueue.isEmpty()){
            int levelSize = levelsQueue.size();
            LinkedList<Integer> levelNodes = new LinkedList<>();
            boolean isReverse = levelIndex%2!=0;
            for(int i=0;i<levelSize;i++){
                TreeNode node = levelsQueue.poll();
                if(isReverse){
                    levelNodes.addFirst(node.val);
                }else{
                    levelNodes.addLast(node.val);
                }
                if(node.left!=null){
                    levelsQueue.offer(node.left);
                }
                if(node.right!=null){
                    levelsQueue.offer(node.right);
                }
            }
            levels.add(levelNodes);
            levelIndex++;
        }
        return levels;
    }
}
