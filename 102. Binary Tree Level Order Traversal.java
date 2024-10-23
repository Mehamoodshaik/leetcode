/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> levels = new ArrayList<>();
        Queue<TreeNode> levelQueue = new LinkedList<>();
        if (root == null) {
            return levels;
        }
        levelQueue.offer(root);
        while (!levelQueue.isEmpty()) {
            int levelSize = levelQueue.size();
            List<Integer> levelNodes = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = levelQueue.poll();

                levelNodes.add(node.val);

                if (node.left != null) {
                    levelQueue.offer(node.left);
                }
                if (node.right != null) {
                    levelQueue.offer(node.right);
                }
            }
            levels.add(levelNodes);

        }
        return levels;
    }
}
