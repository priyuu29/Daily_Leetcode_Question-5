// Last updated: 8/25/2025, 12:44:40 PM
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
    int Camera=0;
    public int minCameraCover(TreeNode root) {
        int c=minCamera(root);
        if(c==-1){
            Camera++;
        }
        return Camera;
    }
    public int minCamera(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=minCamera(root.left);
        int right=minCamera(root.right);
        if(left==-1||right==-1){//-1 is node pr camera ki need h
            Camera++;
            return 1;//camers setup kara h iss node pe
        }
         else if(left==1||right==1){//1 is ik pr ya dono pr camera h or koi ik cover h ya camera
            // Camers++;
            return 0;//cover h
        }
        else{//1 is ik pr ya dono pr camera h or koi ik cover h ya camera
            // Camers++;
            return -1;//need a camera
        }
    }
}