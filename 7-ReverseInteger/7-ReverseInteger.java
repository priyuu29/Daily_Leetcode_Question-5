// Last updated: 8/13/2025, 10:27:22 AM
class Solution {
    public int reverse(int x) {
        int ans = 0;
        int maxr= Integer.MAX_VALUE;
        int minr = Integer.MIN_VALUE;

        while (x != 0) {
            int r = x % 10;
            x /= 10;

            if (ans > maxr / 10 || (ans == maxr / 10 && r > 7)) {
                return 0;  
            }
            if (ans < minr / 10 || (ans == minr/ 10 && r < -8)) {
                return 0;  
            }

           ans= ans * 10 +r;
        }
        return ans;
    }
}
