// Last updated: 8/13/2025, 10:27:14 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[idx]) {
                idx++;
                nums[idx] = nums[i];
            }
        }
    return (idx+1);
    }
}