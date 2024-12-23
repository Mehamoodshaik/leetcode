/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public int MinimumOperations(TreeNode root) {
        Queue<TreeNode> q = new Queue<TreeNode>();

        q.Enqueue(root);
        int swap =0;
        while(q.Count>0){
            int qSize = q.Count;
            int[] arr = new int[qSize];
            for(int i=0;i<qSize;i++){
                TreeNode node = q.Dequeue();
                arr[i] = node.val;
                if(node.left!=null){
                    q.Enqueue(node.left);
                }
                if(node.right!=null){
                    q.Enqueue(node.right);
                }
            }
            swap+= CycleDecomposition(arr,qSize);
        }
        return swap;
    }

    public int CycleDecomposition(int[] arr, int qSize){
        Pair[] arrPos = new Pair[qSize];
        for(int i=0;i<qSize;i++){
            arrPos[i] = new Pair(i,arr[i]);
        }
        Array.Sort(arrPos,(a,b)=>a.Value-b.Value);

        int swapCount  =0;
        bool[] visited = new bool[qSize];
        for(int i=0;i<qSize;i++){
            if(visited[i] || arrPos[i].Index==i){
                continue;
            }

            int j =i;
            int cycleSize = 0;
            while(!visited[j]){
                visited[j] = true;
                j = arrPos[j].Index;
                cycleSize++;
            }
            if(cycleSize>0){
                swapCount+= cycleSize-1;
            }
        }
        return swapCount;
    }
}

public class Pair{
    public int Index;
    public int Value;
    public Pair(int index,int value){
        this.Index = index;
        this.Value = value;
    }
}
