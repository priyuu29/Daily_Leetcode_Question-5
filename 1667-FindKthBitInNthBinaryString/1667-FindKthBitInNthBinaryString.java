// Last updated: 8/13/2025, 10:24:14 AM
class Solution {
    public char findKthBit(int n, int k) {
        String s1 = "0";
        String prob = helper(n, s1);
        return prob.charAt(k - 1); // k is 1-indexed
    }

    String helper(int n, String s1) {
        if (n == 1) return s1;
        String prev = helper(n - 1, s1);
        return prev + "1" + reverseAndInvert(prev);
    }

    String reverseAndInvert(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i) == '0' ? '1' : '0');
        }
        return sb.reverse().toString();
    }
}
