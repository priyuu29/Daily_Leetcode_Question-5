// Last updated: 8/13/2025, 10:23:14 AM
class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int count = 0;
        Arrays.sort(banned);
        for (int i = 1, j = 0; i <= n; i++) {
            if (maxSum - i < 0) {
                break;
            }
            while (j < banned.length && banned[j] < i) {
                j++;
            }
            if (j < banned.length && banned[j] == i) {
                j++;
                continue;
            }
            count++;
            maxSum -= i;
        }

        return count;
        
    }
}