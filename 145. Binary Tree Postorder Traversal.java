 //145. Binary Tree Postorder Traversal Mehamood Shaik

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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root,res);
        return res;
    }

    public void dfs(TreeNode root, List<Integer> res){
        if (root==null){
            return;
        }
        dfs(root.left,res);
        dfs(root.right,res);
        res.add(root.val);
    }
}


/* Intuition
The postorder traversal for a binary tree visits nodes in the following order: left subtree, right subtree, and then the root node. This means that for each node, we first traverse its left child, then its right child, and finally process the current node itself.

Approach
We can solve this problem using a recursive depth-first search (DFS) approach:

We define a helper method dfs that traverses the tree.
For each node, the dfs method is called recursively on the left child and then on the right child.
After both child nodes are processed, the current node’s value is added to the result list.
The traversal starts from the root and continues until all nodes are visited, following the postorder sequence.
The main method postorderTraversal initializes the result list and calls the helper method to fill this list with the traversal order.

Complexity
Time complexity: O(n)
We visit each node exactly once, where n is the number of nodes in the tree.
Space complexity: O(n)
In the worst case, the space complexity is linear due to the recursion stack. This happens in scenarios where the tree is skewed, meaning all nodes are either to the left or right.*/