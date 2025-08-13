// Last updated: 8/13/2025, 10:24:26 AM
class Solution {
    public int maxScore(String s) {
        int maxScore = 0;
        int n = s.length();
        int t = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                t++;
            }
        }
        
        int left = 0, right = t;
        for (int i = 0; i < n - 1; i++) { 
            if (s.charAt(i) == '0') {
                left++;
            } else {
                right--;
            }
            

            int score = left + right;
            maxScore = Math.max(maxScore, score);
        }
        
        return maxScore;
    }
}
