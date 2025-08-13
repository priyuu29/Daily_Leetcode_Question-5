// Last updated: 8/13/2025, 10:22:46 AM
class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]%2==nums[i]%2){
                return false;
            }
        }
        return true;
    }
}