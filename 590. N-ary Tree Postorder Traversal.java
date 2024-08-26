//590. N-ary Tree Postorder Traversal Mehamood Shaik

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        dfs(root,res);
        return res;


    }

    public void dfs(Node root, List<Integer> res){
        if (root==null){
            return;
        }
        for (Node child : root.children){
            dfs(child,res);
        }
        res.add(root.val);
    }
}



/*
Intuition
In a postorder traversal, we visit all the children of a node before visiting the node itself. This means we need to fully process each child subtree before we can process the parent node. This approach naturally aligns with a depth-first search (DFS), where we recursively traverse down to the leaves before handling the nodes at higher levels.

Approach
Recursive DFS:

We start at the root and recursively visit each child of the current node before processing the current node itself.
For each node, we iterate through its list of children and recursively call the dfs method on each child.
After all the children have been visited, we add the value of the current node to the result list.
If the root is null, we simply return an empty list.
Initialization:

The main method postorder initializes an empty list res to store the result of the traversal.
It then calls the helper method dfs, passing the root node and the result list res.
Edge Case:

The function correctly handles the case where the tree is empty by returning an empty list if the root is null.
Complexity
Time complexity: O(n)
We visit each node exactly once, where n is the total number of nodes in the tree.
Space complexity: O(n)
The space complexity is determined by the recursion stack. In the worst case (when the tree is highly unbalanced), the recursion depth can be equal to the number of nodes, which results in linear space complexity. Additionally, the space required to store the result list is also linear.
 */