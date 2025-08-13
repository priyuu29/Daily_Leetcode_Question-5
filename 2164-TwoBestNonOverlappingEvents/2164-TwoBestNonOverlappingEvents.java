// Last updated: 8/13/2025, 10:23:40 AM
import java.util.Arrays;

class Solution {
    public int maxTwoEvents(int[][] e) {
        Arrays.sort(e, (a, b) -> a[1] - b[1]);

        int n = e.length, res = 0;
        int[] maxVal = new int[n];
        maxVal[0] = e[0][2];

        for (int i = 1; i < n; i++) {
            maxVal[i] = Math.max(maxVal[i - 1], e[i][2]);
        }

        for (int i = 0; i < n; i++) {
            int st = e[i][0], val = e[i][2], low = 0, high = i - 1, best = 0;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (e[mid][1] < st) {
                    best = maxVal[mid];
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            res = Math.max(res, val + best);
        }

        return Math.max(res, maxVal[n - 1]);
    }
}
