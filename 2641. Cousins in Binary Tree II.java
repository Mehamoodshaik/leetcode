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
    public TreeNode replaceValueInTree(TreeNode root) {
        if(root==null){
            return root;
        }
        Queue<TreeNode> queue = new LinkedList<>();  
        queue.offer(root);
        int prevLevSum = root.val;
        while(!queue.isEmpty()){
            
            int queueSize = queue.size();
            Queue<TreeNode> levelNodes = new LinkedList<>();
            int levelSum = 0;
            for(int i=0;i<queueSize;i++){
                TreeNode node = queue.poll();
                node.val =prevLevSum- node.val;
                int siblingSum = (node.left!=null ? node.left.val:0)+(node.right!=null?node.right.val:0);
                if(node.left!=null){
                    levelSum+=node.left.val;
                    node.left.val = siblingSum;
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    levelSum+=node.right.val;
                    node.right.val = siblingSum;
                    queue.offer(node.right);
                }
            }
            prevLevSum = levelSum;
        }

      
        return root;
    }
}
