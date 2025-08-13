// Last updated: 8/13/2025, 10:25:28 AM
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
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).dt;
        // if(root==null){
        //     return 0;
        // }
        // int ld=diameterOfBinaryTree(root.left);
        // int rd=diameterOfBinaryTree(root.right);
        // int sd=ht(root.right)+ht(root.left)+2;
        // return Math.max(sd,Math.max(rd,ld));
    }
    public DiaPair diameter(TreeNode root){
        if(root==null){
            return new DiaPair();
        }
        DiaPair ldp=diameter(root.left);
        DiaPair rdp=diameter(root.right);
        int sd=ldp.ht+rdp.ht+2;
        DiaPair sdp=new DiaPair();
        sdp.dt=Math.max(sd,Math.max(rdp.dt,ldp.dt));
        sdp.ht=Math.max(rdp.ht,ldp.ht)+1;
        return sdp;
    }
    class DiaPair{
        int dt=0;
        int ht=-1;

    }
    // public int ht(TreeNode root){
    //     if(root==null){
    //         return -1;
    //     }
    //     int lh =ht(root.left);
    //     int rh =ht(root.right);
    //     return Math.max(lh,rh)+1;
    // }
}