// Last updated: 8/28/2025, 12:18:48 PM
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
    List<Integer> i=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        in(root);
        return i;
    
    }
    void in(TreeNode root){
        if(root ==null) return;
        i.add(root.val);
        in(root.left);
        in(root.right);
    }
}