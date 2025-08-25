// Last updated: 8/25/2025, 12:44:50 PM
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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        return find(root,low,high);
        
    }
    private TreeNode find(TreeNode r, int l, int h){
        if(r==null) return null;
        if(r.val<l){
            return find(r.right, l, h);
        }
        if(r.val>h){
            return find(r.left,l,h);
        }

        r.left=find(r.left,l,h);
        
        r.right=find(r.right,l,h);

        return r;

    }
}