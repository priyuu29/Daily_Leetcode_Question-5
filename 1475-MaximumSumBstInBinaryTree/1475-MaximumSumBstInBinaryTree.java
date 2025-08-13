// Last updated: 8/13/2025, 10:24:41 AM
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
    public int maxSumBST(TreeNode root) {
        return Valid(root).ans;
    }
    public bstpair Valid(TreeNode root){
        if(root==null){
            return new bstpair();
        }
        bstpair lbp=Valid(root.left);
        bstpair rbp=Valid(root.right);
        bstpair sbp=new bstpair();
        sbp.min=Math.min(lbp.min,Math.min(rbp.min,root.val));
        sbp.max=Math.max(lbp.max,Math.max(rbp.max,root.val));
        sbp.sum=lbp.sum+rbp.sum+root.val;
        sbp.isbst=lbp.isbst && rbp.isbst && lbp.max<root.val && rbp.min>root.val;
        if(sbp.isbst){
            sbp.ans=Math.max(lbp.ans,Math.max(rbp.ans,sbp.sum));
        }
        else{
            sbp.ans=Math.max(lbp.ans,rbp.ans);
        }
        return sbp;
    }
    class bstpair{
        boolean isbst=true;
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
        int sum=0;
        int ans=0;
    }
}