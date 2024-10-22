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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> breadthQueue1 = new LinkedList<>();
        Queue<TreeNode> breadthQueue2 = new LinkedList<>();
        breadthQueue1.add(p);
        breadthQueue2.add(q);

        while (!breadthQueue1.isEmpty() && !breadthQueue2.isEmpty()) {
            TreeNode node1 = breadthQueue1.remove();
            TreeNode node2 = breadthQueue2.remove();
            if (node1 == null && node2 == null) {
                continue;
            }
            if (node1 == null || node2 == null) {
                return false;
            }
            if (node1.val != node2.val) {
                return false;
            }
            breadthQueue1.add(node1.left);

            breadthQueue1.add(node1.right);

            breadthQueue2.add(node2.left);

            breadthQueue2.add(node2.right);

        }
        return breadthQueue1.isEmpty() && breadthQueue2.isEmpty();
    }
}
