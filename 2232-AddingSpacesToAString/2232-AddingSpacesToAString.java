// Last updated: 8/13/2025, 10:23:37 AM
class Solution {
    public String addSpaces(String s, int[] spaces) {
        int n = s.length();
        int m = spaces.length;
        char[] chrs = new char[n + m];
        int i = 0, j = 0;

        for (int k = 0; k < n; k++) {
            char chr = s.charAt(k);
            if (j < m && i == spaces[j]) {
                chrs[i + j] = ' ';
                j++;
            }
            chrs[i + j] = chr;
            i++;
        }

        return new String(chrs);
    }
}