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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        leaves1 = dfs(root1,leaves1);
        leaves2 = dfs(root2,leaves2);
        
        return leaves1.equals(leaves2);

    }

    private List<Integer> dfs(TreeNode root, List<Integer> leaves){
        if(root==null){
            return leaves;
        }
        dfs(root.left,leaves);
        if(root.left == null && root.right==null){
            leaves.add(root.val);
        }
        dfs(root.right,leaves);
        return leaves;
    }
}


//https://leetcode.com/problems/leaf-similar-trees/solutions/5748241/beats-100-solutions-0ms-java-python-c
