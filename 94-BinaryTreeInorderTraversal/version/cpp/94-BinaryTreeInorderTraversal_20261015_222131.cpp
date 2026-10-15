// Last updated: 10/15/2026, 10:21:31 PM
1/**
2 * Definition for a binary tree node.
3 * struct TreeNode {
4 *     int val;
5 *     TreeNode *left;
6 *     TreeNode *right;
7 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
8 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
9 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
10 * };
11 */
12class Solution {
13public:
14    void fun(TreeNode* nn,vector<int>&ll){
15        if(!nn) return ;
16        fun(nn->left,ll);
17        ll.push_back(nn->val);
18        fun(nn->right,ll);
19    }
20    vector<int> inorderTraversal(TreeNode* root) {
21        vector<int>ll;
22        if(root==NULL) return ll;
23        fun(root,ll);
24        return ll;
25    }
26};