// Last updated: 8/28/2025, 12:18:13 PM
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
    public TreeNode convertBST(TreeNode root) {
        if(root==null) return root;
        
        find(root,0);
        
        return root;

    }

    private int find(TreeNode r,int sum){
        if(r==null) return sum;

        r.val+=find(r.right,sum);

        return find(r.left,r.val);

    }
}