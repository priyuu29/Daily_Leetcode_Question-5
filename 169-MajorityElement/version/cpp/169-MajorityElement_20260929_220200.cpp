// Last updated: 9/29/2026, 10:02:00 PM
1class Solution {
2public:
3    int majorityElement(vector<int>& nums) {
4        // int sum=0;
5        int e=nums[0];
6        int vote=1;
7        for(int i=1;i<nums.size();i++){
8            if(e==nums[i]){
9                vote++;
10            }
11            else {
12                vote--;
13                if(vote==0){
14                    e=nums[i];
15                    vote=1;
16                }
17            }
18        }
19        return e;
20    }
21};