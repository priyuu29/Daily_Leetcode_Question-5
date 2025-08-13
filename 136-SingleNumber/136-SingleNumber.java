// Last updated: 8/13/2025, 10:26:41 AM
class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i:nums){
            ans^=i;
        }
        return ans;
    }
}