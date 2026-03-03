// Last updated: 3/3/2026, 10:20:52 PM
1/**
2 * Definition for a binary tree node.
3 * struct TreeNode {
4 *     int val;
5 *     TreeNode *left;
6 *     TreeNode *right;
7 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
8 * };
9 */
10
11class Solution {
12public:
13    TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q) {
14        if(root==NULL) return NULL;
15        if(root==p||root==q) return root;
16        TreeNode*left=lowestCommonAncestor(root->left,p,q);
17        TreeNode*right=lowestCommonAncestor(root->right,p,q);
18
19        if(left&&right) return root;
20        else if(!left) return right;
21        else return left;
22    }
23};