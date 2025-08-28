// Last updated: 8/28/2025, 12:18:36 PM
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
    int c=0;
    int ans=0;
    public int kthSmallest(TreeNode root, int k) {
        // List<Integer> ll=new ArrayList<>();
        kth(root,k);
        return ans;
        // return ll.get(k-1);
    }
    private void kth(TreeNode r,int k){
       if(r==null) return ;
       kth(r.left,k);
       c+=1;
       if(c==k){
        ans=r.val;
        return;
       }
       kth(r.right,k);
    }
}