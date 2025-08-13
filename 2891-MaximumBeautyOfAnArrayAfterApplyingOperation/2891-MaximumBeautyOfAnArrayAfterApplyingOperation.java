// Last updated: 8/13/2025, 10:22:59 AM
class Solution {
    public int maximumBeauty(int[] nums, int k) {
        if (nums.length == 1) return 1;
        int maxB = 0, maxV = 0;
        for (int n : nums) maxV = Math.max(maxV, n);
        int[] c = new int[maxV + 1];
        for (int n : nums) {
            c[Math.max(n - k, 0)]++;
            c[Math.min(n + k + 1, maxV)]--;
        }
        int sum = 0;
        for (int v : c) {
            sum += v;
            maxB = Math.max(maxB, sum);
        }
        return maxB;
    }
}
