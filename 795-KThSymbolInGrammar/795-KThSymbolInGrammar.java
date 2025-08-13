// Last updated: 8/13/2025, 10:25:08 AM
class Solution {
    public int kthGrammar(int n, int k) {
        if (n == 1) return 0;

        int parent = kthGrammar(n - 1, (k + 1) / 2);
        boolean isKEven = (k % 2 == 0);

        if (parent == 0) {
            return isKEven ? 1 : 0;
        } else {
            return isKEven ? 0 : 1;
        }
    }
}
