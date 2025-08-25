// Last updated: 8/25/2025, 12:44:36 PM
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
    int ans=0;
    public int maxAncestorDiff(TreeNode root) {
        // if()
        int kin=Integer.MAX_VALUE;
        int kan=Integer.MIN_VALUE;
        md(root,kin,kan);
        return ans;
    }
    public void md(TreeNode root,int c,int m){
        if(root==null) return ;
        
        c=Math.min(c,root.val);
        m=Math.max(m,root.val);

        // ans=Math.abs(c-m);
        ans = Math.max(ans, Math.abs(c - m));
        md(root.left,c,m);
        md(root.right,c,m);
    }
}