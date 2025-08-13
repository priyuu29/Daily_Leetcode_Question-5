// Last updated: 8/13/2025, 10:26:35 AM
class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int a=0;
        for(int i:nums){
            a^=i;
        }
        return a;
    }
};