// Last updated: 8/25/2025, 12:44:30 PM
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
     public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        inorder(root1, a);
        inorder(root2, b);
        mergeLists(a, b, ans);
        return ans;
    }

    private void inorder(TreeNode root, List<Integer> ans) {
        if (root == null)
            return;

        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
    }

    private void mergeLists(List<Integer> list1, List<Integer> list2, List<Integer> ans) {
        int n = list1.size(), m = list2.size(), i = 0, j = 0;
        while (i < n && j < m) {
            if (list1.get(i) <= list2.get(j))
                ans.add(list1.get(i++));
            else
                ans.add(list2.get(j++));
        }

        while (i < n)
            ans.add(list1.get(i++));
        while (j < m)
            ans.add(list2.get(j++));
    }
}