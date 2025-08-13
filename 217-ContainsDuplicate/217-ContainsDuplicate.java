// Last updated: 8/13/2025, 10:26:15 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int prvidx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[prvidx]) {
                prvidx++;
            }
            else{
                return true;
            }
        }
        return false;

    }
}