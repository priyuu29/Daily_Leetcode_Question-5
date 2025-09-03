// Last updated: 9/3/2025, 12:11:21 PM
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
    public boolean isEvenOddTree(TreeNode root) {
        return ise(root);
    }
    public boolean ise(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean evenLevel = true; 

        while (!q.isEmpty()) {
            int size = q.size();
            int prev = evenLevel ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                int v = node.val;

               
                if (evenLevel && v % 2 == 0) return false; 
                if (!evenLevel && v % 2 == 1) return false; 

           
                if (evenLevel) {
                    if (v <= prev) return false; 
                } else {
                    if (v >= prev) return false; 
                }

                prev = v; 

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            evenLevel = !evenLevel; 
        }
        return true;
    }
}