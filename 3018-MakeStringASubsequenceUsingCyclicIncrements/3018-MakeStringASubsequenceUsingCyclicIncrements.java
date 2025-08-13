// Last updated: 8/13/2025, 10:22:58 AM
class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int idx = 0, len = str2.length();
        
        for (char curr : str1.toCharArray()) {
            if (idx < len && (str2.charAt(idx) - curr + 26) % 26 <= 1) {
                idx++;
            }
        }
        return idx == len;
        
    }
}