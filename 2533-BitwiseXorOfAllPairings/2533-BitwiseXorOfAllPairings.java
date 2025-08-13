// Last updated: 8/13/2025, 10:23:18 AM
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int result = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        if (n2 % 2 == 1) {
            for (int num : nums1) {
                result ^= num;
            }
        }        
        if (n1 % 2 == 1) {
            for (int num : nums2) {
                result ^= num;
            }
        }        
        return result;
    }
}